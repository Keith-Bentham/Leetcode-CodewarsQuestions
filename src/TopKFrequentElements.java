import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keith Bentham
 */
public class TopKFrequentElements {
    // use maxHeap. Put entry into maxHeap so we can always poll a number with largest frequency
        public List<Integer> topKFrequent(int[] nums, int k) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                min = Math.min(nums[i], min);
                max = Math.max(nums[i], max);
            }
            int[] map = new int[max - min + 1];
            for (int i = 0; i < nums.length; i++) map[nums[i] - min]++;
            List<Integer>[] bucket = new List[nums.length + 1];
            for (int i = 0; i < map.length; i++) {
                if (map[i] > 0) {
                    if (bucket[map[i]] == null) bucket[map[i]] = new ArrayList<>();
                    bucket[map[i]].add(i);
                }
            }
            List<Integer> res = new ArrayList<>();
            for (int i = nums.length; i >= 0; i--) {
                if (bucket[i] != null) {
                    for (int num : bucket[i]) {
                        res.add(num + min);
                        if (--k == 0) return res;
                    }
                }
            }
            return res;
        }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3,};
        TopKFrequentElements tkfn = new TopKFrequentElements();
        System.out.println("Given a non-empty array of integers, return the k most frequent elements: " + tkfn.topKFrequent(arr, 2));
    }

}
