package cn.tianqb.leetcode.tree;

import cn.tianqb.tools.TreeNode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/13 19:10
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.right = left;
        root.left = right;
        return root;
    }
}
