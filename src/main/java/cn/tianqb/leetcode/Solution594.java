package cn.tianqb.leetcode;

import java.util.HashMap;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/20 23:41
 */
public class Solution594 {

    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }
        int length = 0;
        for (int num : hash.keySet()) {
            if (hash.containsKey(num + 1)) {
                length = Math.max(length, hash.get(num) + hash.get(num + 1));
            }
        }
        return length;
    }

}
