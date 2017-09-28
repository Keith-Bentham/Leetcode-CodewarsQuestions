/**
 * Created by Keith Bentham
 */
public class ReverseWordsStringIII {
    public String reverseWords(String s) {
        char[] ss = s.toCharArray();
        int start = 0;
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] == ' ') {
                swap(ss, start, i - 1);
                start = i + 1;
            }
        }
        swap(ss, start, ss.length - 1);
        return new String(ss);
    }

    public void swap(char[] ss, int left, int right) {
        while (left < right) {
            char temp = ss[left];
            ss[left] = ss[right];
            ss[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseWordsStringIII rs3 = new ReverseWordsStringIII();
        System.out.println("The reverse line: " + rs3.reverseWords("Let's take LeetCode contest"));
    }
}
