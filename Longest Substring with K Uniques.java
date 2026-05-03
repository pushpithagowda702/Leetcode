class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int len = -1;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        
        while(j < s.length()) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            
            while(map.size() > k) {
                char ch = s.charAt(i);
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0) {
                    map.remove(ch);
                }
                i++;
            }
            
            if (map.size() == k) {
                len = Math.max(len, j - i + 1);
            }
            
            j++;
        }
        return len;
    }
}