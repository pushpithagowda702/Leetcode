class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        Map<List<Integer>, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int num : grid[i]) {
                list.add(num);
            }
            map.put(list, map.getOrDefault(list, 0) + 1);
        }

        for(int i=0; i<n; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<n; j++) {
                list.add(grid[j][i]);
            }
            if(map.containsKey(list)) {
                count += map.get(list);
            }
        }
        return count;
    }
}