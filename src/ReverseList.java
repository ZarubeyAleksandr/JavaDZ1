public class ReverseList {
    public ReverseList() {
    }

    public ListNode reverseList(ListNode head) {
        if (head != null && head.next != null) {
            ListNode prev = null;

            ListNode next;
            for(ListNode current = head; current != null; current = next) {
                next = current.next;
                current.next = prev;
                prev = current;
            }

            return prev;
        } else {
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        ReverseList solution = new ReverseList();
        ListNode reverseHead1 = solution.reverseList(head1);
        printList(reverseHead1);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        ListNode reverseHead2 = solution.reverseList(head2);
        printList(reverseHead2);
        ListNode head3 = null;
        ListNode reverseHead3 = solution.reverseList((ListNode)head3);
        printList(reverseHead3);
    }

    public static void printList(ListNode head) {
        System.out.print('[');

        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.print(']');
        System.out.println();
    }
}