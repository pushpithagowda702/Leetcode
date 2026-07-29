class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i=0; i<k; i++) {
            if(isVowel(s.charAt(i))) {
                count++;
            }
        }
        int res = count;
        for(int i=k; i<s.length(); i++) {
            if(isVowel(s.charAt(i-k))) count--;
            if(isVowel(s.charAt(i))) count++;
            res = Math.max(res, count);
        }
        return res;
    }

    public boolean isVowel(char ch) {
        switch(ch) {
            case 'a','u', 'e', 'i', 'o':
                return true;
        }
        return false;
    }
}