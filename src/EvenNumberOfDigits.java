import java.util.ArrayList;

public class EvenNumberOfDigits {
    public static void main(String[] args) {

        int[] nums = {20, 10, 555, 901, 482, 1771};
        System.out.println("Even: " + findNumbers(nums));
        System.out.println("Not Even: " + findNotEven(nums));
        System.out.println("Even number: " + returnEvenArray(nums));
    }

    //1
    public static int findNotEven(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //2
    public static int findNumbers(int[] nums) {

        int result = 0;

        for (int number : nums) {
            if (String.valueOf(number).length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    //3
    public static ArrayList returnEvenArray(int[] arr) {
        ArrayList<Integer> evenNums = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNums.add(arr[i]);
            }
        }
        return evenNums;
    }

}