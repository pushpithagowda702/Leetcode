class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1) return null;
        ListNode tail = head;
        int m = 1;
        ListNode slow = null;

        while(tail.next != null ) {
            tail = tail.next;
            if(n <= m) {
                slow = slow == null ? head : slow.next;
            } else {
                m++;
            }
        }
        if(slow != null) {
            slow.next = slow.next.next;
        } else {
            head = head.next;
        }
        return head;
    }
}