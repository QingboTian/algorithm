package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/28 15:43
 */
public class Solution415 {

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int ch1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int ch2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = ch1 + ch2 + add;
            sb.append(sum % 10);
            add = sum / 10;
            i--;
            j--;
        }
        if (add > 0) {
            sb.append(add);
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        new Solution415().addStrings("11", "123");
    }

}
