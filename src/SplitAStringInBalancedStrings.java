//Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
// Given a balanced string s, split it into some number of substrings such that:
// Each substring is balanced.
// Return the maximum number of balanced strings you can obtain.
public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;
        char[] array = s.toCharArray();
        for (char t : array) {
            if (t == 'L') {
                balance += 1;
            } else
                balance -= 1;
        }
        if (balance == 0) {
            count += 1;
        }
        return count;
    }
    public static void main(String[] args) {
        SplitAStringInBalancedStrings solution = new SplitAStringInBalancedStrings();

        String testString = "RLRRLLRLRL";
        int result = solution.balancedStringSplit(testString);

        System.out.println("The maximum number of balanced substrings is: " + result);
}}
