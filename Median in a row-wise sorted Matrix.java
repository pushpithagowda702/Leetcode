class Solution {
    public int median(int[][] mat) {
        // code here
        int row = mat.length;
        // int column = mat[0].length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<row; i++) {
            max = Math.max(mat[i][mat[i].length - 1], max);
            min = Math.min(mat[i][0], min);
        }
        int median = (row * mat[0].length)/2;
        
        while(min <= max) {
            int mid = min + (max - min)/2;
            
            int count = totalCount(mat, mid);
            
            if(count <= median) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return min;
    }
    
    public int totalCount(int[][] mat, int target) {
        int row = mat.length;
        int count = 0;
        for(int i=0; i<row; i++) {
            int col = mat[i].length;
            if(mat[i][col - 1] <= target) {
                count += col;
            } else {
                int start = 0, end = col - 1;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
    
                    if (mat[i][mid] <= target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
            }

            count += start;
            }
        }
        return count;
    }
    
}