class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;

        if(root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if(root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if(root.left == null && root.right == null) return null;
            if(root.right == null) return root.left;
            if(root.left == null) return root.right;

            TreeNode node = successor(root.right);
            root.val = node.val;
            root.right = deleteNode(root.right, node.val);
        }
        return root;
    }

    public TreeNode successor(TreeNode node) {
        while(node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }
}