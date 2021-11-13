package cn.tianqb.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/13 17:30
 */
public class Solution448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hash = new HashSet<>();
        for (int num : nums) {
            hash.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!hash.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new Solution448().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

}
