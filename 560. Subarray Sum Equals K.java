class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            sum += nums[i];
            int diff = sum - k;
            if(map.containsKey(diff)) {
                count += map.get(diff);
            }
        }
        return count;
    }
}