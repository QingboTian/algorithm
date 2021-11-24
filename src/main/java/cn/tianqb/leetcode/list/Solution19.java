package cn.tianqb.leetcode.list;

/**
 *
 * 双指针
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/21 18:23
 */
public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode p1 = head, p2 = head;

        for (int i = 0; i < n; i++) {
            p2 = p2.next;
            // p2 先走n个节点  若p2 == null, 则说明删除的是第一个节点，直接返回head.next即可
            if (p2 == null) {
                return head.next;
            }
        }

        ListNode pre = null;
        while (p2 != null) {
            // 保留p1节点信息 用于交换指针
            pre = p1;
            p1 = p1.next;
            p2 = p2.next;
        }

        pre.next = p1.next;
        return head;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head = new ListNode(1);
        new Solution19().removeNthFromEnd(head, 1);
    }
}
