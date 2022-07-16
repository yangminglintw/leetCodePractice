public class Solution {

    public int rightSum(int[] nums, int rightIndex) {

        if (rightIndex == nums.length) return 0;

        int rightSum = 0;

        for (int i = rightIndex; i < nums.length; i++) {
            rightSum += nums[i];
        }

        System.out.printf(String.valueOf(rightSum));

        return rightSum;
    }

    public int leftSum(int[] nums, int leftIndex) {

        if ( leftIndex == 0) return 0;

        int leftSum = 0;

        for (int i =  0; i < leftIndex; i++) {
            leftSum += nums[i];
        }

        return leftSum;
    }

    public int pivotIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (leftSum(nums, i) == rightSum(nums, i)) {
                return i;
            }
        }

        return -1;
    }
}
