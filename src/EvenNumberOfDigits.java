public class EvenNumberOfDigits {
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(": " + findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {

        int result = 0;

        for (int number : nums) {
            if (String.valueOf(number).length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}