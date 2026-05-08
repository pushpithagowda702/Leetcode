class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        combination(candidates, target, 0, curr, res);
        return res;
    }

    private void combination(int[] candidates, int target, int index, List<Integer> curr, List<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(index == candidates.length) {
            return;
        }
        if(target >= candidates[index]) {
            curr.add(candidates[index]);
            combination(candidates, target - candidates[index], index, curr, res);
            curr.remove(curr.size() - 1);
        } 

        combination(candidates, target, index+1, curr, res);
    }
}