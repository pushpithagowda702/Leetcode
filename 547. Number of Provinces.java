class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for(int i=0 ; i<visited.length; i++) {
            if(!visited[i]) {
                findCircleNum(isConnected, visited, i);
                count++;
            }
        }
        return count;
    }

    public void findCircleNum(int[][] isConnected, boolean[] visited, int row) {
        visited[row] = true;
        for(int i=0; i<isConnected.length; i++) {
            if(!visited[i] && isConnected[row][i] == 1) {
                findCircleNum(isConnected, visited, i);
            }
        }
    }
}