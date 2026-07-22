class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int level = 1;
        int sum = Integer.MIN_VALUE;
        int res = 1;
        while(!que.isEmpty()) {
            int len = que.size();
            int levelSum = 0;
            for(int i=0; i<len; i++) {
                TreeNode node = que.poll();
                levelSum += node.val;
                if(node.left != null) que.offer(node.left);
                if(node.right != null) que.offer(node.right);
            }
            if(levelSum > sum) {
                res = level;
                sum = levelSum;
            }
            level++;
        }
        return res;
    }
}