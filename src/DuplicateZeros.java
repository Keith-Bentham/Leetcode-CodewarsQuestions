import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] nums = {1, 4, 0, 1, 0, 9, 9};
        System.out.println(Arrays.toString(duplicateZeros(nums)));
    }

    public static int[] duplicateZeros(int[] arr) {

        //loop through the array until we find a 0 and if we do ->
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                //loop backwards through the array until we find a 0 and if we do move the others numbers to the right of that j[i] position->
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                // lastly we wanna skip over the 0 we just added ->
                // if we get a zero we need to shift 'current position of i' twice to avoid running into the zero we just duplicated->
                i++;
            }
        }
        return arr;
    }

}

//not the most optimum solution O^2