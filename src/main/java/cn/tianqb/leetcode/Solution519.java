package cn.tianqb.leetcode;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/27 15:11
 */
public class Solution519 {

    private Set<Integer> hash = new HashSet<>();
    private int m;
    private int n;

    public Solution519(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int[] flip() {
        Random random = new Random();
        while(true) {
            int index = random.nextInt(m * n);
            if (!hash.contains(index)) {
                hash.add(index);
                return new int[]{index / m, index % n};
            }
        }
    }

    public void reset() {
        hash.clear();
    }
}
