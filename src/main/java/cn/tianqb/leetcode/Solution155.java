package cn.tianqb.leetcode;

import java.util.Arrays;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/7 23:03
 */
public class Solution155 {
}

class MinStack {

    private int min = Integer.MAX_VALUE;
    private int preMin = min;

    private int[] arr;

    private int index = 0;

    public MinStack() {
        arr = new int[10];
    }

    public void push(int val) {
        capacity();
        arr[index++] = val;
        preMin = min;
        min = Math.min(min, val);
    }

    private void capacity() {
        if (index == arr.length) {
            arr = Arrays.copyOf(arr, arr.length + arr.length << 1);
        }
    }

    public void pop() {
        if (index > 0) {
            initMin(arr[index]);
            index--;
        }
    }

    public int top() {
        if (index >= 0) {
            initMin(arr[index]);
            return arr[index--];
        }
        return -Integer.MAX_VALUE;
    }

    public int getMin() {
        return min;
    }

    private void initMin(int val) {
        if (val == min) {
            min = preMin;
        }
    }
}
