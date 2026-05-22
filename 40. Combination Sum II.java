class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        com(candidates, target, curr, res, 0, 0);
        return res;
    }

    private void com(int[] candidates, int target, List<Integer> curr, List<List<Integer>> res, int sum, int index) {
        if(target == sum) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index; i<candidates.length; i++) {
            if(i == index || candidates[i] != candidates[i - 1]) {
                sum += candidates[i];
                if(sum <= target) {
                    curr.add(candidates[i]);
                    com(candidates, target, curr, res, sum, i+1);
                    curr.remove(curr.size() - 1);
                }
                sum -= candidates[i];
            }
        }
    }
}