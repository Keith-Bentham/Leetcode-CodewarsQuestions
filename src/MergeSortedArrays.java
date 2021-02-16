import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        System.out.println("First arr: " + Arrays.toString(nums1) + " + Second arr: " + Arrays.toString(nums2) + " merged array= " + Arrays.toString(merge(nums1, m, nums2, n)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int combinedIndex = m + n - 1;
        while (index1 >= 0 && index2 >= 0) {//Loop until either one of the indexes is 0
            nums1[combinedIndex--] = nums1[index1] > nums2[index2] ? nums1[index1--] : nums2[index2--];
            //Do all assignments and then decrement
        }
        while (index2 >= 0) {
            //THis means the there are smaller elements left over in nums2.
            //In that case just assigning nums2 elements to nums1 will do since the elements in nums1 at that location
            // have already been assigned to the right
            nums1[combinedIndex--] = nums2[index2--];
        }
        return nums1;
    }
}