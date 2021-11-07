package cn.tianqb.leetcode;

import java.util.Arrays;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/7 15:55
 */
public class Solution268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution268().missingNumber(new int[]{0,1}));
    }
}
