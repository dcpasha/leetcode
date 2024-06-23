public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode x, y;
        x = y = head;

        while (y != null && y.next != null) {
            x = x.next;
            y = y.next.next;
        }
        return x;

    }
}
