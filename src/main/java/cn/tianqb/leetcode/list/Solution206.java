package cn.tianqb.leetcode.list;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/14 19:07
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, curr = head;
        while(curr != null) {
            // 将下个节点保存起来
            ListNode next = curr.next;
            // 原来节点上一个节点的信息
            curr.next = pre;
            // 当前节点指针切换完成 将当前节点替换成上个节点
            pre = curr;
            // 切换到下个节点继续操作
            curr = next;
        }
        return pre;
    }
}
