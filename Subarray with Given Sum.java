class Solution {

    // Function to find a continuous sub-array which adds up to a given number.
    public static ArrayList<Integer> subarraySum(int[] arr, int sum) {
        int total = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        ArrayList<Integer> res = new ArrayList<>();
        map.put(0,0);
        for(int i=0; i<arr.length; i++) {
            total += arr[i];
            
            if(map.containsKey(total - sum)) {
                res.add(map.get(total - sum) + 1);
                res.add(i + 1);
                return res;
            }
            map.put(total, i + 1);
            // System.out.println(map);
        }
        return res;
    }
}