
public class ReverseLinkedList {

    public static void main(String[] args) {
        System.out.println(reverseList(null));
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode previousNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode nextTempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextTempNode;
        }
        return previousNode;
    }
}
