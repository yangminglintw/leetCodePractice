package leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int area = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int wide = right - left;
            int tall = Math.min(height[left], height[right]);
            area = Math.max(area, wide * tall);

            if (height[left] > height[right]) {
                right--;
            } else if (height[left] < height[right]) {
                left++;
            } else {
                left++;
                right--;
            }
        }

        return area;
    }
}
