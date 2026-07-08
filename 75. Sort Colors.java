class Solution {
    public void sortColors(int[] nums) {
        int i = 0, s = 0, e = nums.length - 1;
        while(i <= e) {
            if(nums[i] == 0) {
                swap(s, i, nums);
                s++;
                i++;
            } else if(nums[i] == 2) {
                swap(e, i, nums);
                e--;
            } else {
                i++;
            }
        }
    }
    
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}