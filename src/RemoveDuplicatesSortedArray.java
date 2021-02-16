import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5};
        System.out.println("Full array: " + Arrays.toString(nums1));
        System.out.println("Remove dups: apart: " + removeDuplicates(nums1));
    }

    public static int removeDuplicates(int[] nums) {
        // Since first element cant be a duplicate we initialize c as 1
        // It represents the index which we are going to replace the next non-duplicate number;
        // Array is in place and order
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }


}
