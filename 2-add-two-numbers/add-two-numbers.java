class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Sentinel node to anchor the result list
        ListNode tail = dummy;
        int carry = 0;

        // Traverse both lists until everything is processed
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // Calculate the carry for the next position
            tail.next = new ListNode(sum % 10); // Append current digit
            tail = tail.next; // Move placeholder forward
        }

        return dummy.next; // Return head of the actual computed list
    }
}
