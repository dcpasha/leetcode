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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        // 1) Cut the list to two halves
        ListNode l1 = head;
        ListNode prev = null; // is the tail of the 1st half
        ListNode slow = head; // is the head of 2nd half
        ListNode fast = head;

        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null; // cut of the first list

        ListNode l2 = reverse(slow);
        merge(l1, l2);
    } // end reorderList()

    ListNode reverse(ListNode node) {
        ListNode prev = null;
        while(node != null) {
            ListNode next_node = node.next;
            node.next = prev;
            prev = node;
            node = next_node;
        }

        return prev;
    }

    void merge(ListNode l1, ListNode l2){
        while(l1 != null) {
            ListNode l1_next = l1.next;
            ListNode l2_next = l2.next;

            l1.next = l2;
            if (l1_next == null) {
                break;
            }
            l2.next = l1_next;

            l1 = l1_next;
            l2 = l2_next;

        }
    } // end merge
}