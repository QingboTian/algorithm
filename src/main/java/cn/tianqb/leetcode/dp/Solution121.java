package cn.tianqb.leetcode.dp;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/7 19:03
 */
public class Solution121 {

    public int maxProfit(int[] prices) {
        int length = prices.length;
        int lowIn = prices[0];
        int highOut = 0;
        for (int price : prices) {
            if (price < lowIn) {
                lowIn = price;
            } else if (price - lowIn > highOut) {
                highOut = price - lowIn;
            }
        }
        return highOut;
    }

}
