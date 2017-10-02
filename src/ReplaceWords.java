import java.util.*;
/**
 * Created by Keith Bentham
 * In English, we have a concept called root,
 * which can be followed by some other words
 * to form another longer word - let's call
 * this word successor. For example, the root
 * an, followed by other, which can form another
 * word another.
 * Now, given a dictionary consisting of
 * many roots and a sentence. You need to
 * replace all the successor in the sentence
 * with the root forming it. If a successor has
 * many roots can form it, replace it with the
 * root with the shortest length.
 * * * * You need to output the sentence after the replacement.
 */
public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        if (dict == null || dict.size() == 0) return sentence;

        Set<String> set = new HashSet<>();
        for (String s : dict) set.add(s);

        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            String prefix = "";
            for (int i = 1; i <= word.length(); i++) {
                prefix = word.substring(0, i);
                if (set.contains(prefix)) break;
            }
            sb.append(" " + prefix);
        }

        return sb.deleteCharAt(0).toString();
    }

    public static void main(String[] args) {
        List<String> map = new ArrayList<>();
        map.add("cat");
        map.add("bat");
        map.add("rat");
        ReplaceWords rw = new ReplaceWords();
        System.out.println(rw.replaceWords(map, "the cattle was rattled by the battery"));
    }
}
