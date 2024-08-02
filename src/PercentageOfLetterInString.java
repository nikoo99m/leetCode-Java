//Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.
public class PercentageOfLetterInString {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) == letter){
                count++;
            }
        }
        int percentage = (count * 100) / s.length();
        return percentage;
    }
    public static void main(String[] args) {
        PercentageOfLetterInString percentageCalculator = new PercentageOfLetterInString();

        String s1 = "hello";
        char letter1 = 'l';
        int result1 = percentageCalculator.percentageLetter(s1, letter1);
        System.out.println("Percentage of 'l' in 'hello': " + result1 + "%");

        String s2 = "world";
        char letter2 = 'o';
        int result2 = percentageCalculator.percentageLetter(s2, letter2);
        System.out.println("Percentage of 'o' in 'world': " + result2 + "%");

        String s3 = "openai";
        char letter3 = 'p';
        int result3 = percentageCalculator.percentageLetter(s3, letter3);
        System.out.println("Percentage of 'p' in 'openai': " + result3 + "%");

        String s4 = "aaaabbbb";
        char letter4 = 'a';
        int result4 = percentageCalculator.percentageLetter(s4, letter4);
        System.out.println("Percentage of 'a' in 'aaaabbbb': " + result4 + "%");

        String s5 = "percentage";
        char letter5 = 'z';
        int result5 = percentageCalculator.percentageLetter(s5, letter5);
        System.out.println("Percentage of 'z' in 'percentage': " + result5 + "%");
    }
}
