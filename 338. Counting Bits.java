class Solution {
    public int[] countBits(int n) {
        int[] sol = new int[n + 1];
        sol[0] = 0;
        for(int i=1; i<=n; i++) {
            int num = i >> 1;
            sol[i] = sol[num] + (i&1);
        }
        return sol;
    }
}