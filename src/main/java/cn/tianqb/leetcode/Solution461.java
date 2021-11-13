package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/13 17:12
 */
public class Solution461 {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0) {
            if ((xor & 1) == 1) {
                count++;
            }
            xor = xor >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution461().hammingDistance(3, 1));
    }
}
