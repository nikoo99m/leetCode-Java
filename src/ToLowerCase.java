//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
public class ToLowerCase {

    public static String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {

                result.append((char) (c + ('a' - 'A')));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Hello, WORLD!";
        String result = toLowerCase(s);
        System.out.println(result);  // Output: "hello, world!"
    }
}

