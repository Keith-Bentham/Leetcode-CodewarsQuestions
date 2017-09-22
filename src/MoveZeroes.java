/**
 * Created by Keith Bentham
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;  // next non-zero cursor // normal cursor, traverse one time, one pass
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }
}