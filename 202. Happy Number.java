class Solution {
    public boolean isHappy(int n) {
        if(n <= 2) return n==1;

        long slow = n;
        long fast = n;

        do {
            slow = digitsSquare(slow);
            fast = digitsSquare(digitsSquare(fast));
        } while (slow != fast);
        
        return slow == 1;
    }

    private long digitsSquare(long n) {
        long num = 0;
        while(n > 0) {
            long digit = n % 10;
            num += (digit * digit);
            n = n / 10;
        }
        return num;
    }
}