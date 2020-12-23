public class MaxConsOnes {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Max 1s is :" + findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int find1 = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1) {
                find1++;
            } else {
                max = Math.max(find1, max);
                find1 = 0;
            }
        }
        return Math.max(find1, max);
    }
}