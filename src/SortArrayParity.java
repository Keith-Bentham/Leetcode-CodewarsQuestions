import java.util.Arrays;

public class SortArrayParity {

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 4, 2};
        System.out.println("Array before sort: " + Arrays.toString(nums1));
        System.out.println("Even and odd sorted: " + Arrays.toString(sortArrayByParity(nums1)));
    }


    public static int[] sortArrayByParity(int[] A) {
        int[] arr = new int[A.length];
        int t = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                arr[t++] = A[i];
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                arr[t++] = A[i];
            }
        }
        return arr;
    }

}
