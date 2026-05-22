class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(board[i], '.');
        }
        List<List<String>> res = new ArrayList<>();
        solve(n, 0, res, board);
        return res;
    }

    private void solve(int n, int col, List<List<String>> res, char[][] board) {
        if(col == n) {
            constructBoard(res, board);
            return;
        }

        for(int row=0; row<n; row++) {
            if(isSafe(col, row, board)) {
                board[row][col] = 'Q';
                solve(n, col+1, res, board);
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(int col, int row, char[][] board) {
        for(int k=1; k<=col; k++) {
            if((row - k >= 0 && board[row - k][col - k] == 'Q') || (board[row][col - k] == 'Q') || (row + k < board.length && board[row + k][col - k] == 'Q')) return false;
        }
        return true;
    }

    private void constructBoard(List<List<String>> res, char[][] board) {
        int n = board.length;
        List<String> curr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String s = new String(board[i]);
            curr.add(s);
        }
        res.add(new ArrayList(curr));
    }
}