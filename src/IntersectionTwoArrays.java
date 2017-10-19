import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * Created by Keith Bentham
 */
public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arrOne = {1, 2, 2, 1};
        int[] arrTwo = {2, 2};
        IntersectionTwoArrays ita = new IntersectionTwoArrays();
        System.out.println(Arrays.toString(ita.intersection(arrOne, arrTwo)));
    }
}
