class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int i=0, j=s.length()-1;
        while(i<j) {
            while(i<j && !isVowel(s.charAt(i))) i++;
            while(i<j && !isVowel(s.charAt(j))) j--;
            if(i<j) {
                char left = s.charAt(i);
                char right = s.charAt(j);
                if(isVowel(left) && isVowel(right)) {
                    str.setCharAt(i, right);
                    str.setCharAt(j, left);
                    i++;
                    j--;
                }
            } 
        }
        return str.toString();
    }
    public boolean isVowel(char ch) {
        switch(ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                return true;
        }
        return false;
    }
}