class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> (a[1]<=b[1]) ? -1 : 1);
        
        int lastEnd = points[0][1];
        int count = 1;
        for(int i=1; i<points.length; i++) {
            int[] curr = points[i];
            if(curr[0] > lastEnd) {
                count++;
                lastEnd = curr[1];
            }
        }
        return count;
    }
}