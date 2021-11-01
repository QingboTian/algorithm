package cn.tianqb.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/1 9:38
 */
public class Solution575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        if (set.size() >= candyType.length / 2) {
            return candyType.length / 2;
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(new Solution575().distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        System.out.println(new Solution575().distributeCandies(new int[]{1, 1, 2, 3}));
    }
}
