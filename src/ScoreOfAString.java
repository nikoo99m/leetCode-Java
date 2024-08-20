//You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
//
//Return the score of s.
public class ScoreOfAString {
    public int scoreOfString(String s) {
        int score = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return score;
    }
    public static void main(String[] args) {
        ScoreOfAString scorer = new ScoreOfAString();

        String test1 = "abc";
        String test2 = "abcd";
        String test3 = "aA";
        String test4 = "123";
        String test5 = "AAB";

        System.out.println("Score of \"" + test1 + "\": " + scorer.scoreOfString(test1));
        System.out.println("Score of \"" + test2 + "\": " + scorer.scoreOfString(test2));
        System.out.println("Score of \"" + test3 + "\": " + scorer.scoreOfString(test3));
        System.out.println("Score of \"" + test4 + "\": " + scorer.scoreOfString(test4));
        System.out.println("Score of \"" + test5 + "\": " + scorer.scoreOfString(test5));
    }
}

