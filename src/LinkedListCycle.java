import java.util.LinkedList;

public class LinkedListCycle {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3, 1);
        list.add(2, 2);
        list.add(1, 3);
        //    System.out.println(hasCycle2(2));
    }

    public static boolean hasCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Given head, the head of a linked list, determine if the
 * linked list has a cycle in it.
 * <p>
 * There is a cycle in a linked list if there is some
 * node in the list that can be reached again by continuously
 * following the next pointer. Internally, pos is used to
 * denote the index of the node that tail's next pointer
 * is connected to. Note that pos is not passed as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list.
 * Otherwise, return false.
 */

