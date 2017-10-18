import java.util.HashMap;
import java.util.Map;
/**
 * Created by Keith Bentham
 */
class TwoSum {
    public int[] findSumInArray(int[] nums, int target) {
        Map<Integer, Integer> foundValues = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int match = target - nums[i];
            if (foundValues.containsKey(match)) {
                return new int[]{
                        foundValues.get(match), i
                };
            }
            foundValues.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}

