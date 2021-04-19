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


    public static int countConFives(int[] arr) {
        int maxFive = 0;
        int foundFive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                foundFive++;
            } else {
                maxFive = Math.max(maxFive, foundFive);
                foundFive = 0;
            }
        }
        return Math.max(foundFive, maxFive);
    }


}
