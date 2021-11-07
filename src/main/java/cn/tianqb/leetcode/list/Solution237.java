package cn.tianqb.leetcode.list;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/2 10:54
 */
public class Solution237 {
    public void deleteNode(ListNode node) {
        // 用于保存上一个节点
        ListNode pre = node;
        while (node != null) {
            if (node.next == null) {
                // 最后一个节点
                node = null;
                pre.next = null;
            } else {
                node.val = node.next.val;
                // 将当前节点记为上一节点
                pre = node;
                node = node.next;
            }
        }
    }

    /**
     * O(1)
     * @param node
     */
    public void deleteNode2(ListNode node) {
        // 修改值  因为无法访问上一节点 只能先通过val值进行覆盖
        node.val = node.next.val;
        // 修改指针指向
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
//        ListNode head = new ListNode(0, new ListNode(1));
        new Solution237().deleteNode(head.next);
        System.out.println();
    }
}
