class Solution {
    public int[][] generateMatrix(int n) {
        int size = n * n;
        int[][] res = new int[n][n];

        int count = 1;
        int sr = 0, sc = 0, er = n - 1, ec = n - 1;
        while(sr <= er && sc <= ec) {
            for(int i=sc; i<=ec; i++) {
                res[sr][i] = count++;
            }
            sr++;
            for(int i=sr; i<=er; i++) {
                res[i][ec] = count++;
            }
            ec--;
            if(sr <= er) {
                for(int i=ec; i>=sc; i--) {
                    res[er][i] = count++;
                }
                er--;
            }
            if(sc <= ec) {
                for(int i=er; i>=sr; i--) {
                    res[i][sc] = count++;
                }
                sc++;
            }
        }   
        return res;
    }
}