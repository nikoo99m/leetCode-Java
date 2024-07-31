//A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
//
//You are given an array of strings sentences, where each sentences[i] represents a single sentence.
//
//Return the maximum number of words that appear in a single sentence.
public class MaximumNumberOfWordsFoundInSentences {
    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int wordCount = words.length;
            if (wordCount > maxWords) {
                maxWords = wordCount;
            }
        }

        return maxWords;
    }

    public static void main(String[] args) {
        String[] sentences = {
                "I love programming",
                "Python is great for data science",
                "Hello world",
                "The quick brown fox jumps over the lazy dog"
        };

        System.out.println(mostWordsFound(sentences));
    }
}


