package StringManipulation.regex;

public class CheckIfStringContainsOnlyDigits {
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "12345";
        System.out.println(isNumeric(input)); // Output: true
    }
}
