import java.util.Arrays;

public class MaxConsecutiveOnesII {
    // Given a binary array, find the maximum number of consecutive
    // 1s in this array if you can flip at most one 0.

    public static void main(String[] args) {
        int[] nums1 = {1, 0, 1, 1, 0, 1};
        System.out.println("Array: " + Arrays.toString(nums1));
        System.out.println("After flipping zero to one: " + (findMaxConsecutiveOnesII(nums1)));
    }

    public static int findMaxConsecutiveOnesII(int[] nums) {
        int left = 0;
        int right;
        int maxLength = 0;
        int countZeros = 0;
        for (right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                countZeros++;
            }
            while (countZeros == 2) {
                if (nums[left] == 0) {
                    countZeros--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }

}
