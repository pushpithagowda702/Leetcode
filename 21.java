class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode sol = new ListNode();
        ListNode tail = sol;

        while(list1 != null && list2 != null) {
            ListNode curr = new ListNode();
            if(list1.val >= list2.val) {
                curr.val = list2.val;
                list2 = list2.next;
            } else {
                curr.val = list1.val;
                list1 = list1.next;
            }
            tail.next = curr;
            tail = curr;
        }

        if(list1 != null) {
            tail.next = list1;
        }

        if(list2 != null) {
            tail.next = list2;
        }
        return sol.next;
    }
}