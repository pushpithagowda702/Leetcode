class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i = 0;
        int sum = 0;
        int curr = 0;
        while(i < arr.length) {
            curr += arr[i];
            i++;
            if(i >= k) {
                sum = Math.max(curr, sum);
                curr = curr - arr[i - k];
            }
        }
        return sum;
    }
}