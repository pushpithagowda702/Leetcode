class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        subsets(0, nums, curr, res);
        return res;
    }
    private void subsets(int index, int[] nums, List<Integer> curr, List<List<Integer>> res) {
        if(index == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        subsets(index+1, nums, curr, res);
        curr.remove(curr.size() - 1);
        while(index + 1 < nums.length && nums[index] == nums[index + 1]) index++;
        subsets(index+1, nums, curr, res);
    }
}