public class Solution {
    public boolean hasCycle(ListNode fast) {
        if(fast == null || fast.next == null) return false;

        ListNode slow = fast;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}