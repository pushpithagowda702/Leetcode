class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;

        while(head.next != null && head.next.next != null) {
            slow = slow.next;
            head = head.next.next;
        }

        return head.next == null ? slow : slow.next;
    }
}
