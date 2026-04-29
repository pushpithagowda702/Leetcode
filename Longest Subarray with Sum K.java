class Solution {
    public int longestSubarray(int[] arr, int k) {
        int sum = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(map.containsKey(sum - k)) {
                res = Math.max(res, (i - map.get(sum - k)));
            }
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return res;
    }
}