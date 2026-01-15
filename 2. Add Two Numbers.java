class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sol = new ListNode();
        ListNode tail = sol;
        int carry = 0;
        while(l1 != null & l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            ListNode node = createNode(sum, tail);
            tail.next = node;
            tail = node;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            ListNode node = createNode(sum, tail);
            tail.next = node;
            tail = node;
            l1 = l1.next;
        }
        while(l2 != null) {
            int sum = l2.val + carry;
            carry = sum / 10;
            ListNode node = createNode(sum, tail);
            tail.next = node;
            tail = node;
            l2 = l2.next;
        }
        if(carry > 0) {
            ListNode node = createNode(carry, tail);
            tail.next = node;
            tail = node;
        }
        return sol.next;
    }

    private ListNode createNode(int sum, ListNode tail) {
        sum = sum % 10;
        ListNode node = new ListNode(sum);
        return node;
    }
}