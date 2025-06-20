class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Step 1: Create a dummy node and a pointer to track the last node
        ListNode dummy = new ListNode(-1); 
        ListNode current = dummy;

        // Step 2: Merge the lists by picking the smaller node each time
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; // Move the pointer forward
        }

        // Step 3: If any list still has remaining nodes, append them
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Step 4: Return the merged linked list (skip dummy node)
        return dummy.next;
    }
}
