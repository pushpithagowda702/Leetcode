class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0, j = 0;
        int n = nums.length;
        int[] sol = new int[n - k + 1];
        Arrays.fill(sol, Integer.MIN_VALUE);
        while(j < k) {
            sol[i] = Math.max(sol[0], nums[j]);
            j++;
        }

        while(j < n) {
            sol[i+1] = Math.max(sol[i], nums[j]);
            i++;
            j++;
        }
        return sol;
    }
}