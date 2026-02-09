class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;

        if(node == null) {
            return new TreeNode(val);
        }

        while(node != null) {
            if(node.val < val) {
                if(node.right != null) {
                    node = node.right;
                } else {
                    node.right = new TreeNode(val);
                    break;
                }
            } else {
                if(node.left != null) {
                    node = node.left;
                } else {
                    node.left = new TreeNode(val);
                    break;
                }
            }
        }

        return root;
    }
}