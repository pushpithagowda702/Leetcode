class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder s = new StringBuilder();
        while(head != null) {
            s.append(head.val);
            head = head.next;
        }
        int res = 0;
        int n = s.length();
        for(int i=n - 1; i>=0; i--) {
            res = res + ((int) Math.pow(2, n-i-1) * (s.charAt(i) - '0'));
        }
        return res;
    }
}