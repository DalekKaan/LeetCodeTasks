package ru.r1b.solution.task226;

/**
 * 226. Invert Binary Tree
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        var left = invertTree(root.left);
        var right = invertTree(root.right);

        root.right = left;
        root.left = right;
        return root;
    }


}
