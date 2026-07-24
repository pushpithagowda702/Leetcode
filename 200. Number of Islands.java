class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == '1' && visited[i][j] != true) {
                    dfs(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int row, int col, boolean[][] visited) {
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[row].length || grid[row][col] == '0') return;
        if(visited[row][col]) return;
        visited[row][col] = true;
        dfs(grid, row-1, col, visited);
        dfs(grid, row+1, col, visited);
        dfs(grid, row, col-1, visited);
        dfs(grid, row, col+1, visited);
    }
}