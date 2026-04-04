class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;

        int end = x/2, start = 1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            long sq = (long) mid * mid;
            if(sq == (long) x) return mid;
            else if(sq > (long) x) end = mid - 1;
            else start = mid + 1;
        }
        return end;
    }
}