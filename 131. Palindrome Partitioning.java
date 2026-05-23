class Solution {
    public List<List<String>> partition(String s) {
        List<String> curr = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        backtrack(s, 0, curr, res);
        return res;
    }

    private void backtrack(String s, int index, List<String> curr, List<List<String>> res) {
        int n = s.length();
        if(index == n) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index; i<n; i++) {
            String sub = s.substring(index, i+1);
            if(isPalindrome(sub)) {
                curr.add(sub);
                backtrack(s, i+1, curr, res);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}