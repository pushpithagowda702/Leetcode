class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);

        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);

        for(int i=2; i<n-1; i++) {
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        int sol = dp[n-2];
        dp[1] = nums[1];
        dp[2] = Math.max(dp[1], nums[2]);

        for(int i=3; i<n; i++) {
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        return Math.max(sol, dp[n-1]);
    }
}