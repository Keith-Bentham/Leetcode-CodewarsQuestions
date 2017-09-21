import java.util.HashMap;
import java.util.Map;

/**
 * Created by Keith Bentham
 * we use bitwise XOR to solve this problem :
 * first , we have to know the bitwise XOR in java
 * 0 ^ N = N
 * N ^ N = 0
 * So..... if N is the single number
 * N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
 * = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
 * = 0 ^ 0 ^ ..........^ 0 ^ N
 * = N
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int len = nums.length;
        for (int i = 0; i != len; i++)
            ans ^= nums[i];
        return ans;
    }

    public int singleNumber2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, 2);
            } else map.put(num, 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 2, 4};
        SingleNumber sn = new SingleNumber();
        System.out.println("Single number is: " + sn.singleNumber(arr));
        System.out.println("Single number is: " + sn.singleNumber2(arr));

    }
}
