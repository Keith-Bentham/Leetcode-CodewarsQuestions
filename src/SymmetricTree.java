/**
 * Created by Keith Bentham
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return helper(root, root);
    }

    private boolean helper(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;
        }

        return helper(node1.left, node2.right) && helper(node1.right, node2.left);
    }
}
