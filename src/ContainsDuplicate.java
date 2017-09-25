import java.util.HashSet;
import java.util.Set;

/**
 * Created by Keith Bentham
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> arraySet = new HashSet<>();
        for (int i : nums)
            if (!arraySet.add(i))
                return true;
        return false;
    }

    public static int findSingle(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int item : nums) {
            if (!set.remove(item)) {
                set.add(item);
            }
        }
        assert set.size() == 1;
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3 , 4, 4, 5, 5};
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println("Does the array contain duplicates?: " + cd.containsDuplicate(arr));
        System.out.println("Does the array contain duplicates?: " + cd.findSingle(arr));
    }
}
