public class PalindromeLinkedList {
        public boolean isPalindrome(ListNode head) {
            if (head.next == null) {
                return true;
            }

            ListNode slow, fast, prev, node;
            slow = fast = head;

            // Find the middle of LL
            while(fast != null && fast.next != null) { // why is it && not ||?
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println(slow.val);

            // Reverse the second half
            prev = null;
            node = slow;
            while (node != null) {
                ListNode next_node = node.next;
                node.next = prev;
                prev = node;
                node = next_node;
            }

            // Compare 1st and 2nd halves
            while (prev != null) {
                if (prev.val != head.val) {
                    return false;
                } else {
                    prev = prev.next;
                    head = head.next;
                }
            }
            return true;
        }
    }

