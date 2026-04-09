class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList();

        int i = 0;

        while(i < n) {
            int ind = Math.abs(nums[i]) - 1;
            if(nums[ind] < 0) {
                res.add(ind + 1);
            } else {
                nums[ind] = -nums[ind];
            }
            i++;
        }
        
        return res;
    }
}