package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/15 16:48
 */
public class Solution319 {
    public int bulbSwitch(int n) {
        int num = (1 << n) - 1;

        return num;
    }

    public static void main(String[] args) {
        System.out.println(new Solution319().bulbSwitch(2));
    }
}
