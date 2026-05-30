class Solution {
    public boolean checkSubsequenceSum(int[] arr, int k) {
        int[][] dp = new int[arr.length][k+1];
        return backtrack(arr, k, arr.length-1, dp);
    }
    
    private boolean backtrack(int[] arr, int k, int index, int[][] dp) {
        if(k == arr[index]) {
            dp[index][k] = 1;
            return true;
        }
        if(index == 0) {
            if(k == 0) {
                dp[index][k] = 1;
                return true;
            }
            dp[index][k] = 2;
            return false;
        }
        
        if(dp[index][k] != 0) {
            return dp[index][k] == 1;
        }
        
        if(arr[index] <= k) {
            boolean pick = backtrack(arr, k - arr[index], index-1, dp);
            if(pick) {
                dp[index][k] = 1;
                return true;
            }
        }
        boolean noPick = backtrack(arr, k, index-1, dp);
        if(noPick) {
            dp[index][k] = 1;
            return true;
        }
        dp[index][k] = 2;
        return false;
    }
}