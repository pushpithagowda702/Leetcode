class Solution {
    public String longestPalindrome(String s) {
        String sol = "";
        int len = 0;

        for(int i=0; i<s.length(); i++) {
            int len1 = checkPalindrome(s, i, i);
            int len2 = checkPalindrome(s, i, i+1);
            len  = Math.max(len1, len2);
        }
        return sol;
    }

    public int checkPalindrome(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}