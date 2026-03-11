class Solution {
    public int maxProfit(int[] nums) {
        int profit = 0;
        int i = 0, j = i + 1;

        while(j < nums.length) {
            if(nums[i] > nums[j]) {
                i = j;
            } else {
                profit = Math.max(nums[j] - nums[i], profit);
            }
            j++;
        }
        
        return profit;
    }
}