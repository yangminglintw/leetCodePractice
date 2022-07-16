package leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MaximumUnitsOnTruckSolution {

    public int maximumUnits(int[][] boxTypes, int truckSize) {

        int sum = 0;

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1],b[1]));

        ArrayList<Integer> objectArrayList = new ArrayList<Integer>();
        HashMap<Integer, Integer> objectObjectHashMap = new HashMap<>();

        for (int i = 0; i < boxTypes.length; i++) {

            objectArrayList.add(boxTypes[i][0]);

            objectObjectHashMap.put(boxTypes[i][0], boxTypes[i][1]);
        }

        while (truckSize >= 0) {
            int maxNumber = Collections.max(objectArrayList);
            if (truckSize > objectObjectHashMap.get(maxNumber)) {
                sum += maxNumber * objectObjectHashMap.get(maxNumber);
            } else {
                sum += maxNumber * truckSize;
            }
            truckSize -= objectObjectHashMap.get(maxNumber);
            objectArrayList.remove(Integer.valueOf(maxNumber));
        }

        return sum;
    }
}
