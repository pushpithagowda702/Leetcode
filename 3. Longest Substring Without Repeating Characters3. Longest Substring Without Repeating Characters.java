class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        if(n <= 1) return n;

        int i = 0, j = 0;
        int subSeq = 0;
        HashSet<Character> set = new HashSet();

        while(j < n) {
            if(set.add(s.charAt(j))) {
                j++;
            } else {
                subSeq = Math.max(subSeq, set.size());
                set.remove(s.charAt(i));
                i++;
            }
        }
        subSeq = Math.max(subSeq, set.size());
        
        return subSeq;
    }
}