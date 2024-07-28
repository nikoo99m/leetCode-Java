//A string is good if there are no repeated characters.
//
// Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
//
// Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
//
// A substring is a contiguous sequence of characters in a string.
public class GoodSubStringsSize3 {

        public static int countGoodSubstrings(String s) {
            int count = 0;
            for (int i = 0; i < s.length() - 2; i++) {
                String substring = s.substring(i, i + 3);
                if (isGoodSubstring(substring)) {
                    count += 1;
                }
            }
            return count;
        }

        private static boolean isGoodSubstring(String substring) {

            return substring.charAt(0) != substring.charAt(1) &&
                    substring.charAt(0) != substring.charAt(2) &&
                    substring.charAt(1) != substring.charAt(2);
        }
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s)); // Output should be 1
    }
    }


