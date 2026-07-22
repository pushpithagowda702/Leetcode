class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int level = 1;
        while(!que.isEmpty()) {
            int len = que.size();
            boolean flag = false;
            for(int i=0; i<len; i++) {
                TreeNode node = que.poll();
                if(node.left == null && node.right == null) {
                    flag = true;
                    break;
                }
                if(node.left != null) que.offer(node.left);
                if(node.right != null) que.offer(node.right);
            }
            if(flag) break;
            level++;
        }
        return level;
    }
}