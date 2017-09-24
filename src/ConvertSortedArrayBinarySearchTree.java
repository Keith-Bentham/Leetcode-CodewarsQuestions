/**
 * Created by Keith Bentham
 */
public class ConvertSortedArrayBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    /*
        built BST with num[lo, ..., hi]
    */
    private TreeNode construct(int[] nums, int lo, int hi) {
        if (lo > hi) return null;
        if (lo == hi) return new TreeNode(nums[lo]);
        // root:
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = construct(nums, lo, mid - 1);
        root.right = construct(nums, mid + 1, hi);
        return root;
    }
}
