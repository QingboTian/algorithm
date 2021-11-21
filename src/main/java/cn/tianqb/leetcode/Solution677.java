package cn.tianqb.leetcode;

import java.util.HashMap;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/14 17:59
 */
public class Solution677 {

    public static void main(String[] args) {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        System.out.println(mapSum.sum("ap"));
        mapSum.insert("app", 2);
        System.out.println(mapSum.sum("ap"));
        mapSum.insert("apple", 5);
        mapSum.insert("apple", 1);
        System.out.println(mapSum.sum("apple"));
        System.out.println();
    }

}

class MapSum {

    private TrieTree root;
    private HashMap<String, Integer> map;

    public MapSum() {
        root = new TrieTree();
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        int value = val - map.getOrDefault(key, 0);
        map.put(key, val);
        TrieTree temp = root;
        for (int i = 0; i < key.length(); i++) {
            if (temp.next[key.charAt(i) - 'a'] == null) {
                temp.next[key.charAt(i) - 'a'] = new TrieTree();
            }
            temp = temp.next[key.charAt(i) - 'a'];
            temp.val += value;
        }
    }

    public int sum(String prefix) {
        TrieTree temp = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (temp.next[prefix.charAt(i) - 'a'] == null) {
                return 0;
            }
            temp = temp.next[prefix.charAt(i) - 'a'];
        }
        return temp.val;
    }

    private class TrieTree {
        private int val;
        private TrieTree[] next = new TrieTree[26];
    }
}
