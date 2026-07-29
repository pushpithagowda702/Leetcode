class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0;
        int zeros = 0, j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                zeros++;
            }
            while(zeros > 1) {
                if(nums[j] == 0) {
                    zeros--;
                }
                j++;
            }
            res = Math.max(res, i-j);
        }
        return res;
    }
}