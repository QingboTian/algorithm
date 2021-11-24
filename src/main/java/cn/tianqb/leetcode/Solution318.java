package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/22 22:11
 */
public class Solution318 {

    public int maxProduct(String[] words) {
        Node root = new Node();
        int firstMax = 0;
        int secondMax = 0;
        for (String word : words) {
            char[] chs = word.toCharArray();
            Node temp = root;
            // 标记是否有相同的字母
            boolean exist = false;
            for (char ch : chs) {
                int index = ch - 'a';
                if (temp.children[index] == null) {
                    temp.children[index] = new Node();
                } else {
                    exist = true;
                }
                temp.children[index].val = index;
                temp = temp.children[index];
            }
            if (!exist) {
                // 不存在相同的字母
                if (firstMax > chs.length) {
                    secondMax = Math.max(secondMax, chs.length);
                } else {
                    secondMax = firstMax;
                    firstMax = chs.length;
                }
            }
        }
        return firstMax * secondMax;
    }

    class Node {
        int val;
        Node[] children = new Node[26];
    }

    public static void main(String[] args) {
        String[] arr = new String[] {"a","ab","abc","d","cd","bcd","abcd"};
        System.out.println(new Solution318().maxProduct(arr));
    }
}
