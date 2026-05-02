class Solution {
    public int findMinDiff(int arr[], int m) {
        // code here
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length - m + 1; i++) {
            min = Math.min(min, Math.abs(arr[i + m - 1]) - arr[i]);
        }
        return min;
    }
}