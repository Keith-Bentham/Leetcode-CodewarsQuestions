/**
 * Created by Keith Bentham
 * leetcode.com/problems/reverse-integer/description/
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * Note:
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 */

public class ReverseInteger {
    public int reverse(int x) {
        long revInt = 0;// declare a 32 bit integer which will need to be long as we must consider overflow
        while (x != 0) {// while x is not equal to 0 do the following
            revInt = revInt * 10 + (x % 10);//
            x /= 10; //x equals x divide by 10
        }
        return (revInt < Integer.MIN_VALUE || revInt > Integer.MAX_VALUE) ? 0 : (int) revInt;
        // if our value overflows by checking max value or by checking min value if true return 0 else
        //if false return (downcast) revInt from long to int as its what the method is expecting to get
    }

    public static void main(String[] args) {// create main class to check for result
        ReverseInteger ri = new ReverseInteger();// create constructor of method as ri
        System.out.println(ri.reverse(54321));// use ri to assign the value to x
    }
}