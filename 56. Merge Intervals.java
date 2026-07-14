class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> sol = new ArrayList<>();
        sol.add(intervals[0]);
        for(int i=1; i<intervals.length; i++) {
            int[] lastInterval = sol.get(sol.size()-1);
            int[] currInterval = intervals[i];
            if(lastInterval[1] >= currInterval[0]) {
                lastInterval[1] = Math.max(lastInterval[1], currInterval[1]);
            } else {
                sol.add(intervals[i]);
            }
        }
        return sol.toArray(new int[0][]);
    }
}