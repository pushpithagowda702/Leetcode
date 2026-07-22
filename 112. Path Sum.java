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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return pathSum(root, targetSum, 0);
    }

    public boolean pathSum(TreeNode node, int targetSum, int totalSum) {
        if(node == null) {
            return false;
        }
        if(node.left == null && node.right == null) {
            return targetSum == totalSum + node.val;
        }

        return pathSum(node.left, targetSum, totalSum + node.val) || pathSum(node.right, targetSum, totalSum + node.val);
    }
}