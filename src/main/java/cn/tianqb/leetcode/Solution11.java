package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/21 15:12
 */
public class Solution11 {

    public int maxArea(int[] height) {
        int max   = 0;
        int right = height.length - 1;
        int left  = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[right], height[left]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution11().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

}
