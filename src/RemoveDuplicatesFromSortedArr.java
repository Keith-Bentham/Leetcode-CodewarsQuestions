/**
 * Created by Keith Bentham
 */
public class RemoveDuplicatesFromSortedArr {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int found = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[found]) {
                nums[++found] = nums[i];
            }
        }
        return ++found;
    }
}
