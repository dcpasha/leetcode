public class removeNthNodeFromEndLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode x = head;
        ListNode y = head;

        for (int i = 0; i < n; i ++) {
            y=y.next;
        }

        if (y == null) { // given [1] and n = 1. Need to remove the only node, or the first node/head node,
            return head.next;
        }

        while (y.next!=null){
            x = x.next;
            y = y.next;
        }
        x.next = x.next.next; // given [1,2] and n = 1. Need to remove (2) so x.next.next is null

        return head;
    }
}
