public class ReverseString {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        String input1 = "Nikoo";
        String reversed1 = reverseString(input1);
        System.out.println("Original: " + input1);
        System.out.println("Reversed: " + reversed1);
}}