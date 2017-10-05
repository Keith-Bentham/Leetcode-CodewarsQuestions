/**
 * Created by Keith Bentham
 * Find the contiguous subarray within an array
 * (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0], x = nums[0], left = 0;
        for (int i = 1; left < nums.length && i < nums.length; i++) {
            if (x < 0) {
                x = nums[i];
            } else
                x = x + nums[i];
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubArray msa = new MaximumSubArray();
        System.out.println("Has the largest sum: " + msa.maxSubArray(arr));
    }
}
