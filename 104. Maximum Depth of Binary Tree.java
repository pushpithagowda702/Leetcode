class Solution {
    public int maxDepth(TreeNode root) {
        int res = 0;
        if(root != null) {
            res = treeTraversal(root, 1, res);
        }
        return res;
    }

    public int treeTraversal(TreeNode node, int counter, int res) {
        if(node == null) {
            res = Math.max(res, counter-1);
            return res;
        }
        res = treeTraversal(node.left, counter + 1, res);
        res = treeTraversal(node.right, counter + 1, res);
        return res;
    }
}