import java.util.Arrays;
import java.util.Random;

/**
 * Created by Keith Bentham
 */
class ShuffleArray {
    private int[] arr;
    private Random random;

    public ShuffleArray(int[] nums) {
        arr = nums;
        random = new Random();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return arr;
    }

    /**
     * Returns a random shuffling of the array.
     */
    //Algorithm is like this:
    //walk the arr, when we reach index i
    //swap element i with anything in [0, i] with equal probablity.
    public int[] shuffle() {
        int[] res = arr.clone();
        for (int i = 0; i < res.length; i++) {
            int j = random.nextInt(i + 1);
            if (i != j) {
                int tmp = res[i];
                res[i] = res[j];
                res[j] = tmp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        ShuffleArray sa = new ShuffleArray(arr);
        System.out.println("Un-shuffled array: " + Arrays.toString(arr));
        System.out.println("Shuffled array: " + Arrays.toString(sa.shuffle()));
        System.out.println("Reset array: " + Arrays.toString(sa.reset()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */