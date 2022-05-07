public class RootEqualsSumChildren {
    public static void main(String[] args) {
    }


    public static boolean checkTree(TreeNode root) {
        //return true if total val left and right tree values.
        return root.val == root.left.val + root.right.val;
    }

}