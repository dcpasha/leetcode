public class LinkedLinkCycle {
    /* Floyd's tortoise and hare algorithm
    O(n) time to go through entire list
    O(1) constant space for pointers
     */

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;


    /*
    Using HashMap (less optimal)
        HashMap <ListNode, Integer> map = new HashMap<>();
        boolean res = false;

        if (head == null || head.next == null) {
            return false;
        }

        while (head != null && res == false) {
            if (map.get(head)==null){
                map.put(head, 1);
                head = head.next;
            }
            else {
                res = true;
            }
        } // end while
        return res;

     */

    }


}
