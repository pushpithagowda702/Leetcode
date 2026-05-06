class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int j = 0, i = 0;
        int n = nums.length;
        int[] sol = new int[n - k + 1];
        Deque<Integer> que = new ArrayDeque<>();
        
        while(j < n) {
            while(!que.isEmpty() && nums[que.peekLast()] < nums[j]) {
                que.pollLast();
            }

            que.offer(j);

            if (que.peekFirst() <= j - k) {
                que.pollFirst();
            }
            
            if (j >= k - 1) {
                sol[i++] = nums[que.peekFirst()];
            }
            j++;
        }
        return sol;
    }
}