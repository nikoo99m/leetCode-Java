public class CommonPrefix {
    public static void main(String[] args) {


        // Test cases
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"interview", "integrate", "interim"};
        String[] strs4 = {};
        String[] strs5 = {"a"};
        String[] strs6 = {"cir", "car"};

        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
        System.out.println(longestCommonPrefix(strs4));
        System.out.println(longestCommonPrefix(strs5));
        System.out.println(longestCommonPrefix(strs6));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
//    The indexOf method in Java returns the index within the string where the specified substring (prefix) first occurs. If the substring does not occur in the string, it returns -1. When indexOf(prefix) == 0, it means that the prefix is found at the beginning of the string.
//
//        In the context of while (strs[i].indexOf(prefix) != 0), it means:
//
//        We keep checking if the current prefix is not at the start (indexOf(prefix) != 0).
//        If it's not at the start, we shorten the prefix by removing the last character (prefix = prefix.substring(0, prefix.length() - 1)).
//        This continues until we find a match at the beginning or the prefix becomes empty.