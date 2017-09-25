import java.util.*;

/**
 * Created by Keith Bentham
 */
public class TopKFrequentElements {
    // use maxHeap. Put entry into maxHeap so we can always poll a number with largest frequency
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }

        List<Integer> res = new ArrayList<>();
        while (res.size() < k) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 4, 4};
        TopKFrequentElements tkfn = new TopKFrequentElements();
        System.out.println("Given a non-empty array of integers, return the k most frequent elements: " + tkfn.topKFrequent(arr, 2));
    }

}
