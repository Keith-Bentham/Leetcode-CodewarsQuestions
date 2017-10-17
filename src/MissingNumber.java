import java.util.Arrays;

/**
 * Created by Keith Bentham
 */
public class MissingNumber {
    public int missingNumberXor(int[] nums) { //xor
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }

    public int missingNumberBinary(int[] nums) { //binary search array must be sorted O(log n)
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid = (left + right) / 2;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > mid) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        MissingNumber ms = new MissingNumber();
        int[] arr = {0, 2, 1, 4};
        int[] arr2 = {0, 1, 3, 4};
        System.out.println("Unsorted Xor array: " + ms.missingNumberXor(arr));
        System.out.println("Unsorted Binary array: " + ms.missingNumberBinary(arr2));
    }
}
