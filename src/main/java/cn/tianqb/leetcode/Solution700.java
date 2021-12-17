package cn.tianqb.leetcode;

import cn.tianqb.tools.TreeNode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/27 16:31
 */
public class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;
        while (temp != null) {
            if (val == temp.val) {
                return temp;
            }
            if (temp.left == null && temp.right == null) {
                return null;
            }
            if (val > temp.val) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        return null;
    }
}
