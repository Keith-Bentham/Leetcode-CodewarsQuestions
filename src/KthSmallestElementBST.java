/**
 * Created by Keith Bentham
 */
class Node {
    int val;
    Node left;
    Node right;

    Node(int x) {
        val = x;
    }
}

public class KthSmallestElementBST {
    int result = -1;
    int val = 0;

    public int kthSmallest(Node root, int k) {
        if (root == null)
            return result;

        kthSmallest(root.left, k);
        val++;
        if (val == k)
            result = root.val;
        kthSmallest(root.right, k);

        return result;
    }
}
