package LinkedList;
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class NthNodeFromEnd {
    public static ListNode solve(ListNode head, int n) {
        ListNode nthNode = head;
        ListNode temp = head;
        
        int count = 0;

        while (count < n) {
            ++count;
            temp = temp.next;
        }

        while (temp != null &&temp.next != null) {
            temp = temp.next;
            nthNode = nthNode.next;
        }

        if (nthNode.next != null) {
            nthNode.next = nthNode.next.next;
        } else {
            nthNode.next = null;
        }


        return head;
    }
}
