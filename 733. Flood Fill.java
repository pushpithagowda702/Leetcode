class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public void dfs(int[][] image, int row, int col, int color, int pixel) {
        if(row >= image.length || row < 0 || col >= image[0].length || col < 0) {
            return;
        }

        if(image[row][col] != pixel || image[row][col] == color) return;
        image[row][col] = color;
        dfs(image, row-1, col, color, pixel);
        dfs(image, row, col-1, color, pixel);
        dfs(image, row, col+1, color, pixel);
        dfs(image, row+1, col, color, pixel);
    }
}