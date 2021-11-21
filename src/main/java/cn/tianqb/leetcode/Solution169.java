package cn.tianqb.leetcode;

import java.util.HashMap;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/14 19:22
 */
public class Solution169 {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int maxNum = 0;
        int maxCount = 0;
        for (int num : nums) {
            int count = hash.getOrDefault(num, 0) + 1;
            hash.put(num, count);
            if (count > maxCount) {
                maxNum = num;
                maxCount = count;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution169().majorityElement(new int[]{6,5,5}));
    }

}
