class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
        int ans = 0;
        for(int i : nums) {
            que.offer(i);
        }
        while(k > 0) {
            ans = que.poll();
            k--;
        }
        return ans;
    }
}