public class MaxConsOnes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 2, 2, 2, 2, 2, 1};
        System.out.println("Max 1s is :" +
                findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int foundOne = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                foundOne++;
            } else {
                max = Math.max(foundOne, max);
                foundOne = 0;
            }
        }
        return Math.max(foundOne, max);
    }
}
