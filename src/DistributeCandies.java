import java.util.HashSet;
import java.util.Set;

/**
 * Created by Keith Bentham
 * Given an integer array with even length, where different numbers in
 * this array represent different kinds of candies. Each number means
 * one candy of the corresponding kind. You need to distribute these
 * candies equally in number to brother and sister. Return the maximum
 * number of kinds of candies the sister could gain.
 Example 1:
 Input: candies = [1,1,2,2,3,3]
 Output: 3
 Explanation:
 There are three different kinds of candies (1, 2 and 3), and two
 candies for each kind.
 Optimal distribution: The sister has candies [1,2,3] and the brother
 has candies [1,2,3], too.
 The sister has three different kinds of candies.
 Example 2:
 Input: candies = [1,1,2,3]
 Output: 2
 Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1].
 The sister has two different kinds of candies, the brother has only one kind of candies.
 */

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) kinds.add(candy);
        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
    }

    public int distributeCandies2(int[] candies) {
        boolean[] a = new boolean[200001];
        int num = 0;
        for (int i = 0; i < candies.length; i++) {
            if (!a[100000 + candies[i]]){
                a[100000 + candies[i]] = true;
                num++;
            }
            if(num == candies.length / 2) return num;

        }
        return num;
    }
    public static void main(String [] args){
        int[] arr={1,1,2,2,3,3};
        int[] arr2={1,1,2,3};
        DistributeCandies ds=new DistributeCandies();
        System.out.println("Optimal distribution: "+ds.distributeCandies(arr));
        System.out.println("Optimal distribution: "+ds.distributeCandies(arr2));
    }
}
