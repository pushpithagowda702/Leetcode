class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;
        int i = 0;
        int len = flowerbed.length;
        while(i < len) {
            if(flowerbed[i] != 1) {
                int left = (i == 0) ? 0 : flowerbed[i-1];
                int right = (i == len-1) ? 0 : flowerbed[i+1];
                if(right == 0 && left == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
                if(n == 0) return true;
            }
            i=i+1;
        }
        return false;
    }
}