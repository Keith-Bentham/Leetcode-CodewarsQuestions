import javax.swing.tree.TreeNode;

/**
 * Created by Keith Bentham
 */


public class miniAbsolutDifferenceBetweenValuesOfAnyTwoNodes {
    int min = Integer.MAX_VALUE;
    Integer prev = null;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        getMinimumDifference(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev);
            prev = root.val;
            getMinimumDifference(root.right);
            return min;
        }
        return 0;
    }
}
