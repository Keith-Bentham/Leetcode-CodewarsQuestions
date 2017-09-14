/**
 * Created by Keith Bentham
 * Get the sum of two integers without the use of + or -
 */

public class GetSum {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
    /**
     * if b is equal to 0 return true, just a as no addition is needed if its true
     * return a recursive call if its false to a to the power of b otherwise return (a exclusive OR b) and left shift 1
     */

    public static void main(String[] args) {
        GetSum gs = new GetSum();
        System.out.println(gs.getSum(43, 2));
    }
}