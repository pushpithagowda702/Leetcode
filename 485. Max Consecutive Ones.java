class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int j = 0;
        int counter = 0;
        while(j < nums.length) {
            if(nums[j] == 1) {
                counter++;
            } else {
                res = Math.max(counter, res);
                counter = 0;
            }
            j++;
        }
        res = Math.max(counter, res);
        return res;
    }
}