class Solution {
    public int trap(int[] height) {
        int leftMax = 0, rightMax = 0;
        int i = 0, j = height.length - 1;
        int res = 0;

        while(i < j) {
            if(height[i] < height[j]) {
                leftMax = Math.max(leftMax, height[i]);
                res += leftMax - height[i];
                i++;
            } else {
                rightMax = Math.max(rightMax, height[j]);
                res += rightMax - height[j];
                j--;
            }
        }
        return res;
    }
}