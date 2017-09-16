import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keith Bentham
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String inputString, int open, int close, int max){

        if(inputString.length() == max*2){
            list.add(inputString);
            return;
        }

        if(open < max)
            backtrack(list, inputString+"(", open+1, close, max);
        if(close < open)
            backtrack(list, inputString+")", open, close+1, max);
    }

    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        System.out.println("Generate Parenthesis: " + gp.generateParenthesis(3));
    }
}
