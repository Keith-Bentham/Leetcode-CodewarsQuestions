/**
 * Created by Keith Bentham
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println("is \"anagram\" and \"nagaram\" valid anagrams of each other: " + va.isAnagram("anagram", "nagaram"));
        System.out.println("is \"rat\" and \"car\" valid anagrams of each other: " + va.isAnagram("rat", "car"));
    }
}

