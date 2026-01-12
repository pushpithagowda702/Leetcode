class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ind = 0;
        int val = nums[0];
        for(int i = 1; i<nums.length; i++) {
            if(nums[i] != val) {
                if((i - ind) > Math.floor(nums.length/2)) return nums[i - 1];
                ind = i;
                val = nums[i];
            }
        }
        return val;
    }
}