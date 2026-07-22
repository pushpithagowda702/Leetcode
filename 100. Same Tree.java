class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return treeTraversal(p, q);
    }

    public boolean treeTraversal(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return treeTraversal(p.left, q.left) && treeTraversal(p.right, q.right);
    }
}