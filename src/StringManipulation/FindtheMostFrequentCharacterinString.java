package StringManipulation;

import java.util.HashMap;


public class FindtheMostFrequentCharacterinString {
    public static char mostFrequentChar(String str) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = ' ';
        int maxCount = 0;

        for (char c : freqMap.keySet()) {
            if (freqMap.get(c) > maxCount) {
                mostFrequent = c;
                maxCount = freqMap.get(c);
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        String input = "hello world";
        System.out.println(mostFrequentChar(input));
    }
}

