import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Max 1s is : "
                + Arrays.toString(getConcatenation(arr)));
    }

    public static int[] getConcatenation(int[] nums) {
        int newArr[] = new int[(nums.length * 2)];
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
            newArr[i + nums.length] = nums[i];
        }
        return newArr;
    }
}

