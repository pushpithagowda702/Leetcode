class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String sol = strs[0];

        for(int i=1; i<strs.length; i++) {
            String curr = strs[i];
            if(curr.length() == 0) return "";
            for(int j=0; j<Math.min(curr.length(), sol.length()); j++) {
                if(curr.charAt(j) != sol.charAt(j)) {
                    sol = sol.substring(0, j);
                    break;
                }
                if(j == Math.min(curr.length(), sol.length()) - 1) sol = sol.substring(0, j + 1);
            }
        }
        return sol;
    }
}