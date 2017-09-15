import java.util.Stack;
/**
 * Created by Keith Bentham
 */
public class ValidParentheses {
    public boolean validParenthesesCheck(String s) {
        Stack<Integer> parentheStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int validItems = "(){}[]".indexOf(s.substring(i, i + 1));
            if (validItems % 2 == 1) {
                if (parentheStack.isEmpty() || parentheStack.pop() != validItems - 1) {
                    return false;
                }
            } else parentheStack.push(validItems);
        }
        return parentheStack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println("Is {[()} valid: " + vp.validParenthesesCheck("{[()}"));
        System.out.println("Is {[()]} valid: " + vp.validParenthesesCheck("{[()]}"));
    }
}
