package cn.tianqb.leetcode;

import java.util.HashMap;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/8 19:51
 */
public class Solution299 {

    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> hash = new HashMap<>();
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        int a = 0, b = 0;
        for (int i = 0; i < s.length; i++) {
            hash.put(s[i], hash.getOrDefault(s[i], 0) + 1);
            if (s[i] == g[i]) {
                a++;
            }

        }
        for (int i = 0; i < s.length; i++) {
            Integer count = hash.get(g[i]);
            if (count != null && count > 0) {
                b++;
                count--;
                if (count == 0) {
                    hash.remove(g[i]);
                }
            }
        }

        return a + "A" + (b - a) + "B";
    }

    public static void main(String[] args) {
        System.out.println(new Solution299().getHint("1807", "7810"));
    }

}
