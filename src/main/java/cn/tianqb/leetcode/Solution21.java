package cn.tianqb.leetcode;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/1 10:01
 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;

        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                tail.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                tail.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            tail = tail.next;
        }

        tail.next = l1 == null ? l2 : l1;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        new Solution21().mergeTwoLists(l1, l2).print();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        ListNode tail = this;
        while (tail != null) {
            System.out.print(tail.val + "->");
            tail = tail.next;
        }
    }
}
