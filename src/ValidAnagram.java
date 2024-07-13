//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        ValidAnagram checker = new ValidAnagram();

        String[][] testCases = {
                {"anagram", "nagaram"},
                {"rat", "car"},
                {"listen", "silent"},
                {"triangle", "integral"},
                {"apple", "pale"}
        };

        for (String[] testCase : testCases) {
            String s = testCase[0];
            String t = testCase[1];
            System.out.println("Are \"" + s + "\" and \"" + t + "\" anagrams? " + checker.isAnagram(s, t));
        }
    }
}
