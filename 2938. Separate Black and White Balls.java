class Solution {
    public long minimumSteps(String s) {
        long oneCount = 0;
        long count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') {
                oneCount++;
            } else {
                count += oneCount;
            }
        }
        return count;
    }
}