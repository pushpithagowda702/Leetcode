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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        Queue<ListNode> que = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(int i=0; i<lists.length; i++) {
            ListNode node = lists[i];
            while(node != null) {
                que.offer(node);
                node = node.next;
            }
        }
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(!que.isEmpty()) {
            ListNode node = que.poll();
            node.next = null; 
            temp.next = node;
            temp = temp.next;
        }
        return head.next;
    }
}