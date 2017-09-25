import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Keith Bentham
 */
public class BinaryTreeInorderTraversal {
    List<Integer> lst = new ArrayList<>();
    public List<Integer> inorderTraversal(Node root) {
        traversal(root);
        return lst;
    }

    public List<Integer> inorderTraversal2(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();

        Node cur = root;
        if (root == null){
            return result;
        }
        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }

    private void traversal(Node root) {
        if (root == null)
            return;
        traversal(root.left);
        lst.add(root.val);
        traversal(root.right);
    }
}
