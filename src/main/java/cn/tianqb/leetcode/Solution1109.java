package cn.tianqb.leetcode;

import java.util.Arrays;

/**
 * 航班
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/9/1 11:36
 */
public class Solution1109 {

    public int[] solution(int[][] booking, int n) {
        int length = booking.length;
        // 差分数组
        int[] temp = new int[n];
        for (int i = 0; i < length; i++) {
            int[] item = booking[i];
            int first = item[0];
            int end = item[1];
            int seats = item[2];
            temp[first - 1] += seats;
            if (end != n) {
                // 边界值 差分数组最后一位
                temp[end] -= seats;
            }

        }

        for (int i = 1; i < n; i++) {
            temp[i] += temp[i - 1];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[][] booking = {{1,2,10},{2,3,20},{2,5,25}};
        int[] solution = new Solution1109().solution(booking, 5);
        Arrays.stream(solution).forEach(System.out::println);
    }

}
