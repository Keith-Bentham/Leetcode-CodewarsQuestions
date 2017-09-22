/**
 * Created by Keith Bentham
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = 0, time = 0;
        for (int find : nums) {
            if (majority == find) {
                time++;
            } else {
                if (--time <= 0) {
                    majority = find;
                    time = 1;
                }
            }
        }
        return majority;
    }
}
