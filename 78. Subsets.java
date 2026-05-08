class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        subsets(0, res, nums, curr);
        return res;
    }

    public void subsets(int index, List<List<Integer>> res, int[] nums, List<Integer> current) {
        if(index == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        subsets(index+1, res, nums, current);
        current.remove(current.size() - 1);
        subsets(index+1, res, nums, current);
    }
}