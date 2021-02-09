import java.util.HashSet;

public class LongestPalindromeSum {

    public static void main(String[] args) {
        LongestPalindromeSum lps = new LongestPalindromeSum();
        System.out.println("One longest palindrome that can be built is \"dccaccd\", whose length is: " + lps.longestPalindrome("abccccdd"));
    }

    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char letter : s.toCharArray()) {
            if (set.contains(letter)) set.remove(letter);
            else set.add(letter);
        }

        int odd = set.size();
        return s.length() - (odd == 0 ? 0 : odd - 1);
    }
}
