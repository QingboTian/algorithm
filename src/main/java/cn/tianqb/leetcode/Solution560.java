package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/14 21:06
 */
public class Solution560 {

    public int subarraySum(int[] nums, int k) {

        int count = 0;
        // 窗口大小
        for (int i = 1; i < nums.length; i++) {
            int preSum = 0;
            for (int j = 0; j < i; j++) {
                if (preSum + nums[j] == k) {
                    count++;
                }
                preSum = preSum + nums[j];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution560().subarraySum(new int[]{1,2,1,2,1}, 3));
    }

}
