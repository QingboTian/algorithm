package cn.tianqb.leetcode.list;

import java.util.HashSet;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/14 19:45
 */
public class Solution160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> hash = new HashSet<>();
        ListNode node = headA;
        while(node != null) {
            hash.add(node);
            node = node.next;
        }

        node = headB;
        while(node != null) {
            if (hash.contains(node)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

}
