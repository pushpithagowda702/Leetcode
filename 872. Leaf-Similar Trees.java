class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        traversal(root1, list1);
        traversal(root2, list2);
        return list1.equals(list2);
    }

    public void traversal(TreeNode node, List<Integer> nodes) {
        if(node == null) return;
        if(node.left == null && node.right == null) {
            nodes.add(node.val);
            return;
        }

        traversal(node.left, nodes);
        traversal(node.right, nodes);
    }
}