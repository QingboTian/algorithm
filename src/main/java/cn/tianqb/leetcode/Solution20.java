package cn.tianqb.leetcode;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 左括号必须用相同类型的右括号闭合
 * 左括号必须以正确的顺序闭合
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/10/31 19:16
 */
public class Solution20 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if (equal(stack.peek(), s.charAt(i))) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean equal(char c1, char c2) {
        if (c1 == '(' && c2 == ')') {
            return true;
        }
        if (c1 == '[' && c2 == ']') {
            return true;
        }
        if (c1 == '{' && c2 == '}') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution20().isValid("(([]){})"));
        System.out.println(new Solution20().isValid("([)]"));
        System.out.println(new Solution20().isValid("[()]"));
        System.out.println(new Solution20().isValid("[()]]]"));
    }
}
