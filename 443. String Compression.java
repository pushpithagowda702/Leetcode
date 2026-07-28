class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        if(len == 1) return len;
        int i=0, j=0;
        int count=0;
        while(j < len) {
            char ch = chars[j];
            while(j < len && ch == chars[j]) {
                count++;
                j++;
            }
            chars[i++] = ch;
            if(count > 1) {
                String s = count + "";
                for(int k=0; k<s.length(); k++) {
                    chars[i++] = s.charAt(k);
                }
            }
            count = 0;
        }
        return i;
    }
}