class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        
        int len = Integer.MAX_VALUE;
        int i=0, j=0;
        int sum = 0;
        while(j < arr.length) {
            sum += arr[j];
            j++;
            
            while(sum > x) {
                len = Math.min(len, j - i);
                sum -= arr[i];
                i++;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}
