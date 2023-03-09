package Leetcode.LinkedList;

public class Q142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode dummy = head;
                while(slow != dummy){
                    slow = slow.next;
                    dummy = dummy.next;
                }
                return slow;
            }
        }
        return null;
    }
}
