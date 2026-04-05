class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int peak = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] <= arr[i - 1]) {
                peak = i - 1;
                break;
            }
        }

        if(peak == 0 || arr[peak] <= arr[arr.length - 1]) return false;

        for(int j=peak; j<arr.length - 1; j++) {
            if (arr[j] <= arr[j + 1]) return false;
        }
        return true;
    }
}