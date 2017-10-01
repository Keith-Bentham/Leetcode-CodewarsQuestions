/**
 * Created by Keith Bentham
 */
public class BasicCalculatorII {
    public int calculate(String str) {
        int result = 0;
        int prev = 0;
        int num = 0;
        char sign = '+';
        char s[] = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            }
            if ((!Character.isDigit(c) && c != ' ') || i == s.length - 1) {
                switch (sign) {
                    case '+':
                        prev = num;
                        break;
                    case '-':
                        prev = -num;
                        break;
                    case '*':
                        result -= prev;
                        prev *= num;
                        break;
                    case '/':
                        result -= prev;
                        prev /= num;
                        break;
                }
                result += prev;
                num = 0;
                sign = c;
            }
        }
        return result;
    }
}
