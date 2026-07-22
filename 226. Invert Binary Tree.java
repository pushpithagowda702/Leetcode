class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        inversion(root);
        return root;
    }

    public void inversion(TreeNode node) {
        if(node == null) {
            return;
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        inversion(node.left);
        inversion(node.right);
        return;
    }
}