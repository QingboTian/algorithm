package cn.tianqb.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/21 21:48
 */
public class Solution56 {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i + 1][0] > intervals[i][1]) {
                list.add(intervals[i]);
            }

        }
        return null;
    }

}
