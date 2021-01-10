import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String [] args){
        int[] nums = {-12,-6,2,6,8};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums){

        int[] arr = new int[nums.length];

        for (int i=0; i<nums.length; i++){
            arr[i] = nums[i] * nums[i];
        }

        Arrays.sort(arr);
        return arr;
    }
}
