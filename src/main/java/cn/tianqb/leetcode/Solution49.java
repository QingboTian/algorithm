package cn.tianqb.leetcode;

import java.util.*;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/12/1 23:02
 */
public class Solution49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<int[], List<String>> hash = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            int[] count = new int[26];
            for (char ch : chars) {
                count[ch - 'a'] += 1;
            }
            contain()
            List<String> list = hash.getOrDefault(count, new ArrayList<>());
            list.add(str);
            hash.put(count, list);
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry entry : hash.entrySet()) {
            result.add((List<String>) entry.getValue());
        }
        return new ArrayList<>(hash.values());
    }

    private void contain(int[] count, HashMap<int[], List<String>> hash, String str) {
        Set<Map.Entry<int[], List<String>>> entries = hash.entrySet();
        for (Map.Entry<int[], List<String>> entry : entries) {
            int[] key = entry.getKey();
            if (Arrays.equals(key, count)) {
                List<String> list = Optional.ofNullable(entry.getValue()).orElse(new ArrayList<>());
                list.add(str);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,2,3};
        System.out.println(Arrays.equals(arr1, arr2));
        new Solution49().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

}
