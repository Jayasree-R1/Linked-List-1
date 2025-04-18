//TC: O(n)
 //SC: O(1)
 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next; // for garbage collection
        slow.next = slow.next.next;
        temp.next = null; // for garbage collection

        return dummy.next;
    }
}