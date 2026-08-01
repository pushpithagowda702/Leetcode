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
    int ans = 0;
    public int longestZigZag(TreeNode root) {
        if(root.left == null && root.right == null) return 0;
        zigzag(root.left, true, 1);
        zigzag(root.right, false, 1);
        return ans;
    }

    public void zigzag(TreeNode node, boolean isLeft, int res) {
        if(node == null) return;
        ans = Math.max(res, ans);
        if(isLeft) {
            zigzag(node.right, false, res+1);
            zigzag(node.left, true, 1);
        } else {
            zigzag(node.left, true, res+1);
            zigzag(node.right, false, 1);
        }
    }
}