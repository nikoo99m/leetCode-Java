   import java.util.Stack;
public class ValidParentheses {

        public static void main(String[] args) {

            // Test cases
            String s1 = "()";
            String s2 = "()[]{}";
            String s3 = "(]";
            String s4 = "([)]";
            String s5 = "{[]}";
            String s6 = "";
            String s7 = "{[()]}";

            System.out.println(isValid(s1)); // Output: true
            System.out.println(isValid(s2)); // Output: true
            System.out.println(isValid(s3)); // Output: false
            System.out.println(isValid(s4)); // Output: false
            System.out.println(isValid(s5)); // Output: true
            System.out.println(isValid(s6)); // Output: true
            System.out.println(isValid(s7)); // Output: true
        }

        public static boolean isValid(String s) {
            // Stack to keep track of opening brackets
            Stack<Character> stack = new Stack<>();

            // Iterate through each character in the string
            for (char c : s.toCharArray()) {
                // If it's an opening bracket, push it onto the stack
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    // If it's a closing bracket, check for the corresponding opening bracket
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if (c == ')' && top != '(') {
                        return false;
                    }
                    if (c == '}' && top != '{') {
                        return false;
                    }
                    if (c == ']' && top != '[') {
                        return false;
                    }
                }
            }

            // If the stack is empty, all opening brackets had corresponding closing brackets
            return stack.isEmpty();
        }
    }
