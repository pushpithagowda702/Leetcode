class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode reversedNode = null;

        while(head != null) {
            ListNode currNode = new ListNode();
            currNode.val = head.val;
            currNode.next = reversedNode;
            reversedNode = currNode;
            head = head.next;
        }
        return reversedNode;
    }
}