import java.util.Arrays;

/**
 * Created by Keith Bentham
 */
public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        Integer[] index = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            index[i] = i;
        }
        Arrays.sort(index, (a, b) -> (nums[b] - nums[a]));
        String[] result = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[index[i]] = "Gold Medal";
            } else if (i == 1) {
                result[index[i]] = "Silver Medal";
            } else if (i == 2) {
                result[index[i]] = "Bronze Medal";
            } else {
                result[index[i]] = (i + 1) + "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] personOne = {5, 4, 3, 2, 1};
        RelativeRanks rr = new RelativeRanks();
        System.out.println("The common dinner suggestion is: " + Arrays.toString(rr.findRelativeRanks(personOne)));
    }
}
