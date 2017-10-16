/**
 * Created by Keith Bentham
 * Get the sum of two integers without the use of + or -
 * For this, problem, for example, we have a = 1, b = 3,
 * In bit representation, a = 0001, b = 0011,
 * First, we can use "and"("&") operation between a and b to find a carry.
 * carry = a & b, then carry = 0001
 * Second, we can use "xor" ("^") operation between a and b to find the different bit, and assign it to a,
 * Then, we shift carry one position left and assign it to b, b = 0010.
 * Iterate until there is no carry (or b == 0)
 * if b is equal to 0 return a as there is nothing to add
 * return a recursive call if its false to a to the power of b return (a exclusive OR b) and left shift 1
 */

public class GetSum {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }

    public int getSum2(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }

    public static void main(String[] args) {
        GetSum gs = new GetSum();
        System.out.println(gs.getSum(43, 2));
        System.out.println(gs.getSum2(1, 3));
    }
}