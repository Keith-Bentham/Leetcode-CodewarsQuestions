/**
 * Created by Keith Bentham
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas.length == 0) return -1;
        int n = gas.length;
        int ind = 0, total = 0, cur = 0;
        for (int i = 0; i < gas.length; i++) {
            cur += gas[i] - cost[i];
            if (cur < 0) {
                ind = i + 1;
                total += cur;
                cur = 0;
            }
        }
        return total + cur < 0 ? -1 : ind;
    }
}
