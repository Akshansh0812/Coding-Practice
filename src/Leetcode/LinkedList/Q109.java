package Leetcode.LinkedList;

public class Q109 {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return helper(head,null);
    }
    private TreeNode helper(ListNode head, ListNode tail){
        ListNode slow = head;
        ListNode fast = head;
        if(head == tail) return null;

        while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }

        TreeNode temp = new TreeNode(slow.val);
        temp.left = helper(head,slow);
        temp.right = helper(slow.next, tail);
        return temp;
    }
}
