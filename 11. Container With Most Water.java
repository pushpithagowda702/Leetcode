class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int count = 0;
        while(i < j) {
            int b = j - i;
            int l = Math.min(height[i], height[j]);
            count = Math.max(count, l*b);
            if(height[i] > height[j]) {
                j--;
            }  else {
                i++;
            }
        }
        return count;
    }
}