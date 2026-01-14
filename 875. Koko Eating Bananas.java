class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1; int right = 1;

        for(int pile : piles) {
            right = Math.max(right, pile);
        }

        while(left < right) {
            int mid = left + (right - left) / 2; 
            if(canFinish(mid, h, piles)) {
                right = mid;
            } else {
                left = mid  + 1;
            }

        }
        return left;
    
    }

    private boolean canFinish(int num, int h, int[] piles) {
        int totalTime = 0;

        for(int pile : piles) {
            totalTime += Math.ceil((double) pile / num);
        }

        return totalTime <= h;
    }
}