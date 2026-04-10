class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0, n = nums.length - 1;
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        while(i < n - 1 && nums[i] <= 0) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            System.out.println(i + " " + nums[i]);
            int j = i + 1;
            int k = n;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    List<Integer> triplet = new ArrayList();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    res.add(triplet);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if(sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            i++;
        }
        return res;
    }
}