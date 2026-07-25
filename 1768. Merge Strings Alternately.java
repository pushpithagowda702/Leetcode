class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder("");
        int m = word1.length(), n = word2.length();
        for(int i=0; i<Math.min(m, n); i++) {
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
        }
        s.append(m > n ? word1.substring(n, m) : word2.substring(m, n));
        return s.toString();
    }
}