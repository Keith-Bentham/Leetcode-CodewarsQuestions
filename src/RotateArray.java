import java.util.Arrays;
/**
 * Created by Keith Bentham
 */
public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        k %= nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
        return nums;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public int[] rotateArr(int[] array) {
        for (int k = 0; k < array.length / 2; k++) {
            int temp = array[k];
            array[k] = array[array.length - 1 - k];
            array[array.length - 1 - k] = temp;
        }
        return array;
    }

    public int[] rotateArrBuilder(int[] x) {
        {
            int[] d = new int[x.length];
            for (int i = x.length - 1; i >= 0; i--) {
                d[(x.length - i - 1)] = x[i];
            }
            return d;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};
        RotateArray ra = new RotateArray();
        System.out.println(Arrays.toString(ra.rotate(arr, 0)));
        System.out.println(Arrays.toString(ra.rotateArr(arr2)));
        System.out.println(Arrays.toString(ra.rotateArrBuilder(arr3)));
    }
}
