import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 4, 2};
        System.out.println("Array before sort: " + Arrays.toString(nums1));
        System.out.println("Even and odd sorted: " + (heightChecker(nums1)));
    }

    public static int heightChecker(int[] heights) {

        int[] heightToFreq = new int[heights.length + 1];

        for (int height : heights) {
            heightToFreq[height]++;
        }

        int result = 0;
        int curHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }

            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }
        return result;
    }
}



