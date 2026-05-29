class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int a = nums[0], b = nums[1];
        if(n == 2) return Math.max(a, b);
        int c = a + nums[2];
        for(int i=3; i<n; i++) {
            int temp = Math.max((a+nums[i]), (b+nums[i]));
            a = b;
            b = c;
            c = Math.max(temp, c);
        }
        return Math.max(b,c);
    }
}