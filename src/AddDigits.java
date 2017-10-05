/**
 * Created by Keith Bentham
 * dr(n) = 1 + (n - 1) % 9
 Note here, when n = 0, since (n - 1) % 9 = -1,
 the return value is zero (correct).
 From the formula, we can find that the result of
 this problem is immanently periodic, with period (b-1).
 Output sequence for decimals (b = 10):
 ~input: 0 1 2 3 4 ...
 output: 0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 ....
 */
public class AddDigits {
    public int addDigits(int num) {
        int res = num % 9;
        return (num == 0 || res != 0) ? res : 9;
    }

}
