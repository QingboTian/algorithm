package cn.tianqb.leetcode;

import cn.tianqb.tools.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/1 22:39
 */
public class Solution94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }

}
