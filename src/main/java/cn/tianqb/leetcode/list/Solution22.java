package cn.tianqb.leetcode.list;

import cn.tianqb.tools.ListNode;

import java.util.StringJoiner;

/**
 *
 * 链表中倒数第K个节点
 *
 * 1. 遍历长度，继续遍历到指定位置取值
 * 2. 遍历，将链表转数组，数组指定位置取值
 * 3. 双指针
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/9/2 12:52
 */
public class Solution22 {

    public cn.tianqb.tools.ListNode solution1(cn.tianqb.tools.ListNode head, int k) {
        if (head == null || k < 1) {
            return null;
        }

        // 双指针
        cn.tianqb.tools.ListNode p1 = head;
        cn.tianqb.tools.ListNode p2 = head;
        while(p2 != null) {
            for (int i = 0; i < k && p2 != null; i++) {
                p2 = p2.next;
            }
            if (p2 != null) {
                // 每次都更新p2节点为p1的位置
                p2 = p1 = p1.next;
            }
        }
        return p1;
    }

    public cn.tianqb.tools.ListNode solution2(cn.tianqb.tools.ListNode head, int k) {
        if (head == null || k < 1) {
            return null;
        }

        // 双指针
        cn.tianqb.tools.ListNode p1 = head;
        cn.tianqb.tools.ListNode p2 = head;
        while(p2 != null && k > 0) {
            p2 = p2.next;
            k--;
        }
        while(p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        cn.tianqb.tools.ListNode head = new cn.tianqb.tools.ListNode(0);
        cn.tianqb.tools.ListNode tail = head;
        for (int i = 1; i < 10; i++) {
            tail.next = new cn.tianqb.tools.ListNode(i);
            tail = tail.next;
        }

        ListNode listNode = new Solution22().solution2(head, 10);
        StringJoiner str = new StringJoiner("->");
        while (listNode != null) {
            str.add(String.valueOf(listNode.value));
            listNode = listNode.next;
        }
        System.out.println(str.toString());
    }


}


