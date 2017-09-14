import java.util.LinkedList;
import java.util.List;

/**
 * Created by Keith Bentham
 */
public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
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
