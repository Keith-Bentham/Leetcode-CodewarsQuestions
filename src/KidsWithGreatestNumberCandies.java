import java.util.ArrayList;
import java.util.List;

/**
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true]
 * Explanation:
 * Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5
 * candies --- the greatest number of candies among the kids.
 * Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have
 * the greatest number of candies among the kids.
 * Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
 * Kid 4 has 1 candy and even if he or she receives all extra candies will only have
 * 4 candies.
 * Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have
 * the greatest number of candies among the kids.
 * <p>
 * So basically check if extraCandies give to each child can outdo the rest and if its true its
 * true otherwise its false
 */

public class KidsWithGreatestNumberCandies {

    public static void main(String[] args) {

        int[] kidsArray = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println("Bool list: " + kidsWithCandies(kidsArray, extraCandies));
    }

    private static List<Boolean> kidsWithCandies(int[] kidsArray, int extraCandies) {
        ArrayList<Boolean> candieListBool = new ArrayList<>();
        int maxCandieValue = 0;

        for (int candy : kidsArray) {
            maxCandieValue = Math.max(candy, maxCandieValue);
        }

        for (int candy : kidsArray) {
            candieListBool.add(candy + extraCandies >= maxCandieValue);
        }

        return candieListBool;
    }


}
