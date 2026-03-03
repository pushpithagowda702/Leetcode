class Solution {
    public int singleNumber(int[] nums) {
        int sol = nums[0];

        for(int i=1; i<nums.length; i++) {
            sol = sol ^ nums[i];
        }

        return sol;
    }
}