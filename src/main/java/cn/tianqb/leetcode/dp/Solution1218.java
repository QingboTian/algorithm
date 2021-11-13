package cn.tianqb.leetcode.dp;

import java.util.HashMap;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/7 16:19
 */
public class Solution1218 {

    public int longestSubsequence(int[] arr, int difference) {

        int max = 1;
        HashMap<Integer, Integer> dp = new HashMap<>();

        for (int num : arr) {
            dp.put(num, dp.getOrDefault(num - difference, 0) + 1);
            max = Math.max(max, dp.get(num));
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution1218().longestSubsequence(new int[]{1,5,7,8,5,3,4,2,1}, -2));
    }
}
