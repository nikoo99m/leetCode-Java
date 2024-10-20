package StringManipulation;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfaCharacterInString {
    public static int countOccurrences(String str, char ch) {
        Map<Character, Integer> countChar = new HashMap<>();

        for (char c : str.toCharArray()) {
            countChar.put(c, countChar.getOrDefault(c, 0) + 1);
        }

        return countChar.getOrDefault(ch, 0);
    }

    public static void main(String[] args) {
        String input = "hello world";
        char characterToCount = 'l';
        int occurrences = countOccurrences(input, characterToCount);
        System.out.println("Occurrences of '" + characterToCount + "': " + occurrences);
    }

//        public static int countCharacterOccurrences(String str, char ch) {
//            int count = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == ch) {
//                    count++;
//                }
//            }
//            return count;
//        }
//
//        public static void main(String[] args) {
//            String input = "hello world";
//            char ch = 'l';
//            System.out.println(countCharacterOccurrences(input, ch)); // Output: 3
//        }
//    }

}
