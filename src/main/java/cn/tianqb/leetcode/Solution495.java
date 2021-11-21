package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/13 19:43
 */
public class Solution495 {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i] + duration <= timeSeries[i + 1]) {
                sum += duration;
            } else {
                sum += timeSeries[i + 1] - timeSeries[i];
            }
        }
        sum += duration;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution495().findPoisonedDuration(new int[]{1,2,3,4}, 2));
    }

}
