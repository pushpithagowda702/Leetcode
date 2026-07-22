class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int level = 0;
        while(!que.isEmpty()) {
            int len = que.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<len; i++) {
                TreeNode node = que.poll();
                if(level%2 == 0) {
                    list.add(node.val);
                } else {
                    list.add(0,node.val);
                }
                if(node.left != null) que.offer(node.left);
                if(node.right != null) que.offer(node.right);
            }
            res.add(list);
            level++;
        }
        return res;
    }
}