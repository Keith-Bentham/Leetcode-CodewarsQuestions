import java.util.ArrayList;
import java.util.List;
/**
 * Created by Keith Bentham
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in
 * this array.
 */

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[(nums[i] - 1) % nums.length] += nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= nums.length)
                result.add(i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 5, 6, 8, 9};
        FindDisappearedNumbers fdn = new FindDisappearedNumbers();
        System.out.println(fdn.findDisappearedNumbers(arr));
    }
}