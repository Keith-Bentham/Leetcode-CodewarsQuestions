public class MaxConsOnes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 2, 2, 2, 2, 2, 1, 1, 1};
        System.out.println("Max 1s is : " +
                findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int foundOne = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1) {
                foundOne++;
            } else {
                max = Math.max(foundOne, max);
                foundOne = 0;
            }
        }
        return Math.max(foundOne, max);
    }

    public static int maxConsecOnes(int[] arr) {
        int maxOnes = 0;
        int foundOne = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                foundOne++;
            } else {
                maxOnes = Math.max(foundOne, maxOnes);
                foundOne = 0;
            }
        }
        return Math.max(foundOne, maxOnes);
    }


}
