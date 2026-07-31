/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int max = 0;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = null;
        while(slow != null) {
            ListNode curr = slow;
            slow = slow.next;
            curr.next = prev;
            prev = curr;
        }
        while(head != null && prev != null) {
            max = Math.max(head.val + prev.val, max);
            head = head.next;
            prev = prev.next;
        }
        return max;
    }
}