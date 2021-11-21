package cn.tianqb.leetcode;

/**
 * 中间位置扩展法
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/21 13:17
 */
public class Solution5 {

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        char[] ch = s.toCharArray();
        int start = 0, maxLength = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            // 奇数
            int h1[] = helper(ch, i, i);
            // 偶数
            int h2[] = helper(ch, i, i + 1);
            // 当前位置的最长字串
            int length = Math.max(h1[0], h2[0]);
            if (length > maxLength) {
                maxLength = Math.max(length, maxLength);
                // 起始位置
                start = h1[0] > h2[0] ? h1[1] : h2[1];
            }
        }
        return s.substring(start, maxLength + start);
    }

    private int[] helper(char[] ch, int left, int right) {
        while (left >= 0 && right < ch.length) {
            if (ch[left] == ch[right]) {
                left--;
                right++;
            } else {
                break;
            }
        }
        int[] res = new int[2];
        // 长度
        res[0] = right - left - 1;
        // 起始位置
        res[1] = left + 1;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution5().longestPalindrome("babad"));
    }
}
