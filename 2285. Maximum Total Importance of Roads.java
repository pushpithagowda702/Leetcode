class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] outDegree = new int[n];
        long res = 0;
        for(int[] node : roads) {
            outDegree[node[0]]++;
            outDegree[node[1]]++;
        }
        Arrays.sort(outDegree);
        long label = 1;
        for(int i=0; i<n; i++){
            res += (outDegree[i] * label++);
        }
        return res;
    }
}