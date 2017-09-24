/**
 * Created by Keith Bentham
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode evenH = head.next, oddH = head;
        ListNode evenFirst = head.next;
        // because evenH faster than odd Head, so we don't need to see oddH !=null
        while (evenH != null && evenH.next != null) {
            oddH.next = evenH.next;
            oddH = oddH.next;
            evenH.next = oddH.next;
            evenH = evenH.next;
        }
        oddH.next = evenFirst;
        return head;
    }
}