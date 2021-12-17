package cn.tianqb.leetcode.tree;

import cn.tianqb.tools.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/28 17:09
 */
public class Solution98 {

    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode node, long lower, long higher) {
        if (node == null) {
            return true;
        }
        if (node.val <= lower || node.val >= higher) {
            return false;
        }
        return helper(node.left, lower, node.val) && helper(node.right, node.val, higher);
    }

    /**
     * BST的中序遍历为递增数列
     * @param root
     * @return
     */
    private boolean helper2(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode temp = root;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while (temp != null || !stack.isEmpty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }

            temp = stack.pop();
            if (!list.isEmpty() && list.get(list.size() - 1) >= temp.val) {
                return false;
            }
            list.add(temp.val);
            temp = temp.right;
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7)));
        System.out.println(new Solution98().isValidBST(root));
    }

}
