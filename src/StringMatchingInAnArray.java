import java.util.ArrayList;
import java.util.List;

//Given an array of string words, return all strings in words that is a substring of another word. You can return the answer in any order.
//
// A substring is a contiguous sequence of characters within a string
public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> array = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].contains(words[i]) && i != j) {
                    array.add(words[i]);
                    break;
                }
            }

        }
        return array;

    }
    public static void main(String[] args) {
        StringMatchingInAnArray finder = new StringMatchingInAnArray();
        String[] words = {"mass", "as", "hero", "superhero"};
        List<String> substrings = finder.stringMatching(words);
        System.out.println(substrings);
    }
}
