package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/7 22:24
 */
public class Solution136 {

    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        System.out.println(new Solution136().singleNumber(new int[]{4,1,2,1,2}));
    }

}
