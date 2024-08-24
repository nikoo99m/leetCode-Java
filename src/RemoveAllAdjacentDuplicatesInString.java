//You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
//
// We repeatedly make duplicate removals on s until we no longer can.
//
// Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        StringBuilder word = new StringBuilder(s);

        int i = 0;
        while (i < word.length() - 1) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                word.delete(i, i + 2);

                i = Math.max(i - 1, 0);
            } else {
                i++;
            }
        }

        return word.toString();
    }

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString solution = new RemoveAllAdjacentDuplicatesInString();

        String input = "abbaca";
        String result = solution.removeDuplicates(input);

        System.out.println("Final string after all duplicate removals: " + result);
    }
}
