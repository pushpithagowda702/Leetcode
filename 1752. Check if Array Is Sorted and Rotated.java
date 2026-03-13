class Solution {
    public boolean check(int[] nums) {
        if(nums[0] < nums[nums.length - 1]) {
           return check(nums, 0, nums.length - 1);
        } else {
            int i = 0;
            while(i < nums.length - 1 && nums[i] <= nums[i + 1]) i++;
            return check(nums, i + 1, nums.length - 1);
        }
    }

    private boolean check(int[] nums, int start, int end) {
        while(start < end) {
            if(nums[start] > nums[start + 1]) return false;
            start++;
        }
        return true;
    }
}