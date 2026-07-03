class Solution {
    public int removeDuplicates(int[] nums) {
       int a = 0, b = 1;

       while(b < nums.length) {
         if(nums[a] != nums[b]) {
            nums[++a] = nums[b];
         }
         b++;
       }
       return a+1;
    }
}