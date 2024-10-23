package StringManipulation;

public class FindLongestWordInString {
    public static String longestWord(String sentence){
        String[] words = sentence.split("\\s+");
        String result = "";
        for (String word : words){
            if (word.length() > result.length()){
                result = word;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String input = "Find the longest word in this sentence";
        System.out.println(longestWord(input));
    }
}
