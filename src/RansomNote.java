/**
 * Created by Keith Bentham
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote rn = new RansomNote();
        System.out.println("Can the ransom note be used with the magazine \"aa\": " + rn.canConstruct("thiswillfindyou", "thiswillnotfindyou"));
    }
}
