class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
         Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int x[], int y[]) {
                if(x[1] == y[1] || x[1] < y[1]) return -1;
                else return 1;
            }
        });

        int i = 1;
        int res = 1;
        int currRangeEnd = points[0][1];
        
        while(i < n) {
            if(currRangeEnd < points[i][0]) {
                currRangeEnd = points[i][1];
                res++;
            }
            i++;
            
        }
        return res;
    }
}