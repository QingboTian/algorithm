package cn.tianqb.leetcode.tree;

import cn.tianqb.tools.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/7 18:25
 */
public class Solution101 {

    public boolean isSymmetric(TreeNode root) {
        return check1(root, root);
    }

    private boolean check1(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && check1(left.left, right.right) && check1(left.right, right.left);
    }

    private boolean check2(TreeNode left, TreeNode right) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(left);
        queue.offer(right);
        while (!queue.isEmpty()) {
            left = queue.poll();
            right = queue.poll();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null || left.val != right.val) {
                return false;
            }
            queue.offer(left.right);
            queue.offer(right.left);

            queue.offer(right.left);
            queue.offer(left.right);
        }
        return true;
    }

}
