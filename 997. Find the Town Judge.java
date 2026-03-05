class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] out = new int[n+1];
        int[] in = new int[n+1];

        for(int[] item : trust) {
            int s = item[0];
            int d = item[1];

            out[s]++;
            in[d]++;
        }

        for(int i=1; i<n+1; i++) {
            if(out[i] == 0 && in[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}