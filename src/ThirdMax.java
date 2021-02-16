import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMax {

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 4, 2};
        System.out.println("Array before sort: " + thirdMax(nums1));
    }

    public static int thirdMax(int[] nums) {

        Set<Integer> seenMaximums = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            Integer curMaximum = maxIgnoringSeenMaximums(nums, seenMaximums);
            if (curMaximum == null) {
                return Collections.max(seenMaximums);
            }
            seenMaximums.add(curMaximum);
        }

        return Collections.min(seenMaximums);
    }


    private static Integer maxIgnoringSeenMaximums(int[] nums, Set<Integer> seenMaximums) {

        Integer maximum = null;
        for (int num : nums) {
            if (seenMaximums.contains(num)) {
                continue;
            }
            if (maximum == null || num > maximum) {
                maximum = num;
            }
        }
        return maximum;
    }


}



