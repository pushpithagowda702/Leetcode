class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        return dfs(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    public int dfs(TreeNode node, long targetSum) {
        if(node == null) return 0;
        int count = targetSum == node.val ? 1 : 0;
        return count + dfs(node.left, targetSum - node.val) + dfs(node.right, targetSum - node.val);
    }
}