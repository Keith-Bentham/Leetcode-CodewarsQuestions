/**
 * Created by Keith Bentham
 */
class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionTwoLinkedLists {
    public ListNode2 getIntersectionNode(ListNode2 headA, ListNode2 headB) {
        int countA = 0;
        int countB = 0;
        ListNode2 curNodeA = headA;
        ListNode2 curNodeB = headB;
        while (curNodeA != null) {
            countA++;
            curNodeA = curNodeA.next;
        }
        while (curNodeB != null) {
            countB++;
            curNodeB = curNodeB.next;
        }
        curNodeA = headA;
        curNodeB = headB;
        while (countA > countB) {
            curNodeA = curNodeA.next;
            countA--;
        }
        while (countB > countA) {
            curNodeB = curNodeB.next;
            countB--;
        }
        while (curNodeA != curNodeB) {
            curNodeA = curNodeA.next;
            curNodeB = curNodeB.next;
        }
        return curNodeA;
    }
}