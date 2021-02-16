public class OneEditDistance {

    public static void main(String[] args) {
        String first = "a";
        String second = "";

        System.out.println();
        System.out.println("Are they are both one edit distance apart: " + isOneEditDistance(first, second));
    }


    public static boolean isOneEditDistance(String first, String second) {
        // if the input string are same
        if (first.equals(second))
            return false;

        int len1 = first.length();
        int len2 = second.length();
        // If the length difference of the stings is more than 1, return false.
        if ((len1 - len2) > 1 || (len2 - len1) > 1) {
            return false;
        }

        int i = 0, j = 0;
        int diff = 0;
        while (i < len1 && j < len2) {
            char f = first.charAt(i);
            char s = second.charAt(j);
            if (f != s) {
                diff++;
                if (len1 > len2)
                    i++;
                if (len2 > len1)
                    j++;
                if (len1 == len2)
                    i++;
                j++;
            } else {
                i++;
                j++;
            }
            if (diff > 1) {
                return false;
            }
        }
        // If the length of the string is not same. ex. "abc" and "abde" are not one edit distance.
        if (diff == 1 && len1 != len2 && (i != len1 || j != len2)) {
            return false;
        }

        return true;
    }

}
