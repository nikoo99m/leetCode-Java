package StringManipulation.regex;

public class CheckIfStringContainsOnlyLettersandDigits {
    public static boolean isAlphaNumeric(String str) {
        return str.matches("[a-zA-Z0-9]+");
    }

    public static void main(String[] args) {
        String input = "abc123";
        System.out.println(isAlphaNumeric(input)); // Output: true
    }
}

