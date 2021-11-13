package cn.tianqb.leetcode.tree;

import cn.tianqb.tools.TreeNode;

import java.util.Stack;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/13 16:10
 */
public class Solution617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        TreeNode root = new TreeNode();
        TreeNode temp = root;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        Stack<TreeNode> stack3 = new Stack<>();

        while (root1 != null || !stack1.isEmpty() || root2 != null || !stack2.isEmpty()) {
            while(root1 != null || root2 != null) {
                int val1 = root1 == null ? 0 : root1.val;
                int val2 = root2 == null ? 0 : root2.val;
                temp.val = val1 + val2;
                stack1.push(root1);
                stack2.push(root2);
                stack3.push(temp);
                if (root1 != null) {
                    root1 = root1.left;
                }
                if (root2 != null) {
                    root2 = root2.left;
                }
                if (root1 != null || root2 != null) {
                    temp.left = new TreeNode();
                    temp = temp.left;
                }
            }

            root1 = stack1.pop();
            root2 = stack2.pop();
            temp = stack3.pop();
            if (root1 != null) {
                root1 = root1.right;
            }
            if (root2 != null) {
                root2 = root2.right;
            }
            if (root1 != null || root2 != null) {
                temp.right = new TreeNode();
                temp = temp.right;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode right = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null,
                new TreeNode(7)));
        TreeNode treeNode = new Solution617().mergeTrees(left, right);
        System.out.println();
    }
}
