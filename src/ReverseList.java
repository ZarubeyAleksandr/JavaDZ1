import static java.lang.System.*;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {

        /* Example 1: */

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ReverseList solution = new ReverseList();
        ListNode reverseHead1 = solution.reverseList(head1);
        printList(reverseHead1);

        /* Example 2: */
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        ListNode reverseHead2 = solution.reverseList(head2);
        printList(reverseHead2);

        /* Example 3: */

        ListNode head3 = null;
        ListNode reverseHead3 = solution.reverseList(head3);
        printList(reverseHead3);

    }

    public static void printList(ListNode head) {
        out.print('[');
        while (head != null) {
            out.print(head.val + " ");
            head = head.next;
        }
        out.print(']');
        out.println();
    }


}
