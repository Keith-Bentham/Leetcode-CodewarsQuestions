import java.util.ArrayList;
import java.util.List;
/**
 * Created by Keith Bentham
 */
public class BinaryTreeInorderTraversal {
    List<Integer> lst = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        traversal(root);
        return lst;
    }
    private void traversal(TreeNode root) {
        if (root == null)
            return;
        traversal(root.left);
        lst.add(root.val);
        traversal(root.right);
    }
}
