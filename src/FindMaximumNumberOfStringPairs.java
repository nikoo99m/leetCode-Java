import java.util.HashSet;

//You are given a 0-indexed array words consisting of distinct strings.
//
// The string words[i] can be paired with the string words[j] if:
//
// The string words[i] is equal to the reversed string of words[j].
//  0 <= i < j < words.length.
//  Return the maximum number of pairs that can be formed from the array words.
//
//   Note that each string can belong in at most one pair.
public class FindMaximumNumberOfStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();

            if (set.contains(reversedWord)) {
                count++;
                set.remove(reversedWord);
            } else {
                set.add(word);
            }
        }

        return count;
    }


    public static void main(String[] args) {
        FindMaximumNumberOfStringPairs finder = new FindMaximumNumberOfStringPairs();

        String[] words1 = {"abcd", "dcba", "lls", "sll", "abc", "cba"};
        System.out.println(finder.maximumNumberOfStringPairs(words1));

        String[] words2 = {"abc", "def", "ghi"};
        System.out.println(finder.maximumNumberOfStringPairs(words2));
    }
}
