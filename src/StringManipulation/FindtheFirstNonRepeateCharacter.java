package StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class FindtheFirstNonRepeateCharacter {
    public static char firstNonRepeatedChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        return '_';
    }

    public static void main(String[] args) {
        String input = "swiss";
        System.out.println(firstNonRepeatedChar(input));
    }
}