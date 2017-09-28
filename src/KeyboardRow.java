import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Keith Bentham
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String keyboardRegex = "[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*";
        return Stream.of(words)
                .filter(word -> word.toLowerCase().matches(keyboardRegex))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        KeyboardRow kr = new KeyboardRow();
        String[] arr = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println("letters of alphabet on only one row's of American keyboard: " + Arrays.toString(kr.findWords(arr)));
    }
}
