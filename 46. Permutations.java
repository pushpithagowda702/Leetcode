class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        permutation(nums, curr, res);
        return res;
    }

    public void permutation(int[] nums, List<Integer> curr, List<List<Integer>> res) {
        if(curr.size() == nums.length) {
            res.add(new ArrayList(curr));
            return;
        }
        
        for(int i=0; i<nums.length; i++) {
            if(curr.contains(nums[i])) continue;
            curr.add(nums[i]);
            permutation(nums, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}