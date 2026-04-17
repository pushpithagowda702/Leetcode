class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {
            max = Math.max(max, matrix[i][n - 1]);
            min = Math.min(min, matrix[i][0]);
        }

        while(min <= max) {
            int mid = min + (max - min)/2;

            int count = totalCount(matrix, mid);

            if(count <= k - 1) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return min;
    }

    public int totalCount(int[][] matrix, int target) {
        int n = matrix.length;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(matrix[i][n-1] <= target) {
                count += n;
            } else {
                int start = 0, end = n - 1;

                while(start <= end) {
                    int mid = start + (end - start)/2;

                    if(matrix[i][mid] <= target) {
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