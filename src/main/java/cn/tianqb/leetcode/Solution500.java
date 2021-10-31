package cn.tianqb.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个字符串words，只返回可以使用在美式键盘同一行字母打印出来的单词
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/10/31 17:05
 */
public class Solution500 {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        List<String> result = new ArrayList<>();
        for (String w : words) {
            char[] word = w.toLowerCase().toCharArray();

            if (contains(s1, word) || contains(s2, word) || contains(s3, word)) {
                result.add(w);
            }
        }
        return result.toArray(new String[0]);
    }

    private boolean contains(String source, char[] word) {
        for (char c : word) {
            if (!source.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = {"Hello", "Alaska", "Dad", "Peace"};
        Arrays.stream(new Solution500().findWords(arr)).forEach(System.out::println);
    }

}
