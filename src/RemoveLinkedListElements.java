public class RemoveLinkedListElements {

    public static void main(String[] args) {
        System.out.println(removeElements(null, 4)); //always null test//
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;

        ListNode current = head;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        if (head.val == val) {
            return head.next;
        }

        return head;
    }
}
