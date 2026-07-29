class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int ans = 0;
        int prev = 0;
        for(int i=0; i<n; i++) {
            prev = prev + gain[i];
            ans = Math.max(ans, prev);
        }
        return ans;
    }
}