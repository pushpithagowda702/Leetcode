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
    public List<Integer> inorderTraversal(TreeNode node) {
        List<Integer> res = new ArrayList<>();

        if(node == null) {
            return res;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        while(node != null || !stack.isEmpty()) {
            while(node != null) {
                stack.push(node);
                node = node.left;
            }
            TreeNode popNode = stack.pop();
            res.add(popNode.val);
            node = popNode.right;
        }
        return res;
    }
}