/**
 * Created by Keith Bentham
 */
class ListNode {
    int val;
    ListNode2 next;

    ListNode(int x) {
        val = x;
    }
}

public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode2 node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}