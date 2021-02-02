/**
 * Created by Keith Bentham
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in
 * this array.
 */

import java.util.ArrayList;
import java.util.List;


public class FindDisappearedNumbers {

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 5, 6, 8, 9};
        FindDisappearedNumbers fdn = new FindDisappearedNumbers();
        System.out.println(fdn.findDisappearedNumbers(arr));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        int[] count = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0)
                result.add(i);
        }
        return result;
    }
}
