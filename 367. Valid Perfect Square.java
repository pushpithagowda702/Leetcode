class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;

        int start = 2, end = num;

        while(start <= end) {
            int mid = start + (end - start)/2;
            long sqrt = (long) mid * mid;
            if (sqrt == (long) num) {
                return true;
            } else if (sqrt > (long) num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}