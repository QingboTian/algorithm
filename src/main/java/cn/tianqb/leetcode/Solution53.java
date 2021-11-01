package cn.tianqb.leetcode;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
 *
 * 动态规划（https://leetcode-cn.com/problems/maximum-subarray/）
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/1 11:36
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for (int num : nums) {
            sum = Math.max(sum + num, num);
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution53().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(new Solution53().maxSubArray(new int[]{-100000}));
        System.out.println(new Solution53().maxSubArray(new int[]{-2,1}));
    }
}
