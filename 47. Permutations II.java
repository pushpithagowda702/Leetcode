class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] track = new boolean[nums.length];
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        permute(nums, track, res, curr);
        return res;
    }

    private void permute(int[] nums, boolean[] track, List<List<Integer>> res, List<Integer> curr) {
        if(nums.length == curr.size()) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(track[i] || (i > 0 && nums[i] == nums[i - 1] && !track[i - 1])) continue;
            curr.add(nums[i]);
            track[i] = true;
            permute(nums, track, res, curr);
            curr.remove(curr.size() - 1);
            track[i] = false;
        }
    }
}