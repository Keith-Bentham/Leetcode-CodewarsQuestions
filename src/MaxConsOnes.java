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

    public static int findCon(int[] nums) {
        int found1 = 0;
        int max1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                found1++;
            } else {
                max1 = Math.max(found1, max1);
                found1 = 0;
            }
        }
        return Math.max(found1, max1);
    }
}