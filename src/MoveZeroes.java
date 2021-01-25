import java.util.Arrays;
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums1 = {1, 0, 0, 2, 3, 4};
        System.out.println("Array before: " + Arrays.toString(nums1));
        System.out.println("After moving zeros to end: " + Arrays.toString(moveZeroes(nums1)));
    }

    public static int[] moveZeroes(int[] nums) {
        int leftMostZeroIndex = 0; // holds index of leftmost zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i > leftMostZeroIndex) { // There are zero(s) on the left side of the current non-zero number, so we swap them
                    nums[leftMostZeroIndex] = nums[i];
                    nums[i] = 0;
                }
                leftMostZeroIndex++;
            }
        }
        return nums;
    }
}