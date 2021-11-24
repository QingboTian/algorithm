package cn.tianqb.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/22 21:15
 */
public class Solution384 {

    private int[] nums;

    public Solution384(int[] nums) {
        this.nums = nums;
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        int[] array = Arrays.copyOf(nums, nums.length);
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        Collections.shuffle(list);
        array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

}
