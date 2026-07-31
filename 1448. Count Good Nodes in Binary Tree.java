/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return goodNodes(root, Integer.MIN_VALUE);
    }

    public int goodNodes(TreeNode node, int max) {
        if(node == null) return 0;
        int count = max > node.val ? 0 : 1;
        max = Math.max(node.val, max);
        count += goodNodes(node.left, max);
        count += goodNodes(node.right, max);
        return count;
    }
}