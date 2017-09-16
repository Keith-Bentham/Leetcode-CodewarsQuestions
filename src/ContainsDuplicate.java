import java.util.HashSet;
import java.util.Set;

/**
 * Created by Keith Bentham
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> arraySet = new HashSet<>();
        for(int i : nums)
            if(!arraySet.add(i))
                return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println("Does the array contain duplicates?: " + cd.containsDuplicate(arr) );
    }
}
