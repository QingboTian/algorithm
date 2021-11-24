package cn.tianqb.leetcode;

import java.util.*;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/21 15:57
 */
public class Solution15 {

    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        List<List<Integer>> list = new ArrayList<>();
        for (int i : set) {
            for (int j : set) {
                int num =  0 - (i + j);
                List<Integer> item = new ArrayList<>();
                item.add(i);
                item.add(j);
                item.add(num);
                if (set.contains(num) && !contain(list, item)) {
                    list.add(item);
                }
            }
        }
        return list;
    }

    private boolean contain(List<List<Integer>> list, List<Integer> item) {
        for (List<Integer> l : list) {
            return l.equals(item);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution15().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

}
