public class OddEvenLinkedList {

    public static void main(String[] args) {
        System.out.println(oddEvenList(new ListNode(4)));
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode evenH = head.next, oddH = head;
        ListNode evenFirst = head.next;
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