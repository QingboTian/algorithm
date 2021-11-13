package cn.tianqb.leetcode.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/13 18:28
 */
public class Solution234 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();

        // 将链表的值复制到数组中
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        // 使用双指针判断是否回文
        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    public static void main(String[] args) {
        new Solution234().isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))));
    }
}
