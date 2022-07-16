package leetcode;

public class BinarySearch {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int med = (low + high) / 2;

            if (nums[med] > target) {
                System.out.print(med);
                low = med;
            } else if (nums[med] < target) {
                high = med;
            } else {
                return med;
            }
        }

        return -1;
    }

    public static void main(String[] args) {


    }
}
