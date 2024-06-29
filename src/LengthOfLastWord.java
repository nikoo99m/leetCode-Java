//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] word = s.split("\\s+");
        int size = word.length;
        String lastWord =  word[size-1];
        return lastWord.length();

    }
    public static void main(String[] args) {
        LengthOfLastWord lengthFinder = new LengthOfLastWord();

        // Test cases
        String test1 = "Hello World";
        String test2 = "   fly me   to   the moon  ";
        String test3 = "luffy is still joyboy";
        String test5 = "singleWord";

        System.out.println("Length of last word in '" + test1 + "': " + lengthFinder.lengthOfLastWord(test1));
        System.out.println("Length of last word in '" + test2 + "': " + lengthFinder.lengthOfLastWord(test2));
        System.out.println("Length of last word in '" + test3 + "': " + lengthFinder.lengthOfLastWord(test3));
        System.out.println("Length of last word in '" + test5 + "': " + lengthFinder.lengthOfLastWord(test5));
    }
}
