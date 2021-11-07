package cn.tianqb.leetcode;

import cn.tianqb.tools.ListNode;

import java.util.HashSet;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/7 22:35
 */
public class Solution141 {

    public boolean hasCycle(ListNode head) {
        return helper1(head);
    }

    private boolean helper1(ListNode head) {
        HashSet<ListNode> hash = new HashSet<>();
        while (head != null) {
            if (!hash.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    private boolean helper2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
