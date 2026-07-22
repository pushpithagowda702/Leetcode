class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return totalSum(root, false);
    }

    public int totalSum(TreeNode node, boolean flag) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) {
            return flag ? node.val : 0;
        }
        
        int left = totalSum(node.left, true);
        int right = totalSum(node.right, false);
        return left + right;
    }
}