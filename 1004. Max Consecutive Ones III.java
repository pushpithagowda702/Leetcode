class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0, count = 0;
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            }
            while(count > k) {
                if(nums[j] == 0) {
                    count--;
                }
                j++;
            }
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}