import java.util.HashMap;
/**
 * Created by Keith Bentham
 */
public class RomanToInteger {

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0){
            return -1;
        }

        HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
        hMap.put('I', 1);
        hMap.put('V', 5);
        hMap.put('X', 10);
        hMap.put('L', 50);
        hMap.put('C', 100);
        hMap.put('D', 500);
        hMap.put('M', 1000);
        int len = s.length(), result = hMap.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (hMap.get(s.charAt(i)) >= hMap.get(s.charAt(i + 1)))
                result += hMap.get(s.charAt(i));
            else
                result -= hMap.get(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();
        System.out.println("Convert following roman numeral DCXXI to an int: " + rti.romanToInt("DCXXI") );
    }
}
