import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        int[] commonFreq = new int[26];
        Arrays.fill(commonFreq, Integer.MAX_VALUE); // Start with maximum value for comparison

        // Iterate over each word in the array
        for (String word : words) {
            // Frequency array for the current word
            int[] wordFreq = new int[26];

            // Count frequency of each character in the current word
            for (char c : word.toCharArray()) {
                wordFreq[c - 'a']++;
            }

            // Update the commonFreq array with the minimum frequency of each character
            for (int i = 0; i < 26; i++) {
                commonFreq[i] = Math.min(commonFreq[i], wordFreq[i]);
            }
        }

        // Prepare the result list
        List<String> result = new ArrayList<>();

        // Collect all characters that appear in all words
        for (int i = 0; i < 26; i++) {
            // If the character appears more than 0 times in all words
            if (commonFreq[i] > 0) {
                for (int j = 0; j < commonFreq[i]; j++) {
                    result.add(String.valueOf((char) (i + 'a')));
                }
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        FindCommonCharacters sol = new FindCommonCharacters();
        String[] words = {"bella", "label", "roller"};
        System.out.println(sol.commonChars(words));
    }
}


