/**
 * Created by Keith Bentham
 */
public class FirstUniqueCharacterString {
    public int firstUniqChar(String s) {
        int res = s.length();
        for (char i = 'a'; i <= 'z'; i++) {
            int idx = s.indexOf(i);
            if (idx != -1 && idx == s.lastIndexOf(i)) {
                res = Math.min(res, idx);
            }
        }
        return res == s.length() ? -1 : res;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterString fucs = new FirstUniqueCharacterString();
        System.out.println(fucs.firstUniqChar("leetcode"));
    }
}