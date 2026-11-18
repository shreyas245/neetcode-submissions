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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        int length = 0;

        if (head == null) {
            return null;
        }

        while (current != null) {
            length++;
            current = current.next;
        }

        current = head;
        int position = 0;

        if (length == 1) {
            return null;
        }

        if (length == n) {
            return head.next;
        }

        while (current != null) {
            System.out.println("Length : " + length + " Position : " + position);

            if ((length - n) == position) {
                prev.next = current.next;
            }

            prev = current;
            current = current.next;
            position++;
        }

        return head;
    }
}
