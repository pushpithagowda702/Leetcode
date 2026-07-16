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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        List<List<Integer>> res = new ArrayList<>();

        while(!que.isEmpty()) {
            int level = que.size();
            List<Integer> list = new ArrayList<>();
            while(level > 0) {
                if(que.peek().left != null) {
                    que.offer(que.peek().left);
                }
                if(que.peek().right != null) {
                    que.offer(que.peek().right);
                }
                list.add(que.poll().val);
                level--;
            }
            res.add(list);
        }
        return res;
    }
}