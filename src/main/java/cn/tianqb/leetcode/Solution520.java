package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/13 15:28
 */
public class Solution520 {

    public boolean detectCapitalUse(String word) {
        int length = word.length();
        if (length < 2) {
            return true;
        }
        char first = word.charAt(0);
        char second = word.charAt(1);
        if (first > 'Z' && second > 'Z'|| (first < 'a' && second > 'Z')) {
            // 小写
            return helper(word, true);
        }
        if (first < 'a' && second < 'a') {
            return helper(word, false);
        }
        return false;
    }

    private boolean helper(String word, boolean lowCase) {
        for (int i = 2; i < word.length(); i++) {
            if (lowCase) {
                if (word.charAt(i) <= 'Z') {
                    return false;
                }
            } else {
                if (word.charAt(i) >= 'a') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution520().detectCapitalUse("FFFFFFFFFFFFFFFFFFFFf"));
    }

}
