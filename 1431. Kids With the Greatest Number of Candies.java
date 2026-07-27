class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int maxCandies = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++) {
            maxCandies = Math.max(candies[i], maxCandies);
        }
        for(int i=0; i<candies.length; i++) {
            res.add((candies[i]+extraCandies) >= maxCandies);
        }
        return res;
    }
}