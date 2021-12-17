package cn.tianqb.leetcode;

import java.util.*;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/28 14:43
 */
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return Collections.emptyList();
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        char[] pch = p.toCharArray();
        char[] sch = s.toCharArray();
        for (int i = 0; i < pch.length; i++) {
            pCount[pch[i] - 'a']++;
            sCount[sch[i] - 'a']++;
        }

        List<Integer> list = new ArrayList<>();
        if (Arrays.equals(pCount, sCount)) {
            list.add(0);
        }
        for (int i = 0; i < sch.length - pch.length; i++) {
            sCount[sch[i] - 'a']--;
            sCount[sch[i+ pch.length] - 'a']++;
            if (Arrays.equals(pCount, sCount)) {
                list.add(i + 1);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        new Solution438().findAnagrams("cbaebabacd", "abc");
    }
}
