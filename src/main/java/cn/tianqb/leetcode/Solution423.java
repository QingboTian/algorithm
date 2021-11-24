package cn.tianqb.leetcode;

import java.util.HashMap;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/24 20:56
 */
public class Solution423 {



    public String originalDigits(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        char[] chs = s.toCharArray();
        for (char ch : chs) {
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }

        int[] count = new int[10];
        count[0] = hash.getOrDefault('z', 0);
        count[6] = hash.getOrDefault('x', 0);
        count[2] = hash.getOrDefault('w', 0);
        count[4] = hash.getOrDefault('u', 0);
        count[8] = hash.getOrDefault('g', 0);

        count[3] = hash.getOrDefault('h', 0) - count[8];
        count[5] = hash.getOrDefault('f', 0) - count[4];
        count[7] = hash.getOrDefault('v', 0) - count[5];
        count[9] = hash.getOrDefault('i', 0) - count[5] - count[6] - count[8];
        count[1] = hash.getOrDefault('o', 0) - count[0] - count[2] - count[4];

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            int c = count[i];
            for (int j = 0; j < c; j++) {
                res.append(i);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution423().originalDigits("owoztneoer"));
    }

}
