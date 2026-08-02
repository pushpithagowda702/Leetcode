class Solution {
    public String decodeString(String s) {
        StringBuilder curr = new StringBuilder();
        Stack<Integer> num = new Stack<>();
        int n = 0;
        Stack<StringBuilder> str  = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch <= '9' && ch >= '0') {
                n = n * 10 + (ch - '0');
            } else if(ch == '[') {
                str.push(curr);
                num.push(n);
                n = 0;
                curr = new StringBuilder();                
            } else if(ch == ']') {
                StringBuilder sb = str.pop();
                int repeat = num.pop();
                while(repeat-- > 0) {
                    sb.append(curr);
                }
                curr = sb;
            } else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}