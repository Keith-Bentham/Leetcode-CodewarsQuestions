/**
 * Created by Keith Bentham
 * Two methods to reverse a string first using string builder second using swap
 * String Builder may be slower than Iterative swapping method due to extra overhead
 */

public class StringReversal {
    String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    String reverseStringSwap(String s) {
        if (s == null || s.length() == 0)
            return "";
        char[] cs = s.toCharArray();
        int begin = 0, end = s.length() - 1;
        while (begin <= end) {
            char c = cs[begin];
            cs[begin] = cs[end];
            cs[end] = c;
            begin++;
            end--;
        }

        return new String(cs);
    }

    public static void main(String[] args) {
        StringReversal sr = new StringReversal();
        System.out.println("The reverse of Planet is: " + sr.reverseString("Planet"));
        System.out.println("The reverse of Universe is: " + sr.reverseStringSwap("Universe"));
    }
}
