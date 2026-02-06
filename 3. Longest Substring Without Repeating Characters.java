class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        int left=0, right=0;
        int ans = 0;
        Set<Character> set = new HashSet<>();

        while(right < s.length()) {
            if(!set.add(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                ans = Math.max(ans, set.size());
                right++;
            }
        }
        
        return ans;
    }
}