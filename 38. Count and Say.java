class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String prev = countAndSay(n - 1);
        StringBuilder str = new StringBuilder();
        int count = 0;
        int j=0;
        for(int i=0; i<prev.length(); i++) {
            count++;
            if(i == prev.length() - 1 || prev.charAt(i) != prev.charAt(i + 1)) {
                str.append(count +""+ prev.charAt(i));
                count = 0;
            }
        }
        return str.toString();
    }
}