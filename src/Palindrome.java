class Palindrome {
        public boolean isPalindrome(int x) {
            if (x < 0) // Negative numbers are not palindromic
                return false;

            String str = String.valueOf(x);
            int left = 0, right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right))
                    return false;
                left++;
                right--;
            }

            return true;
        }

    public boolean isPalindrome1(int x) {
        // Special cases:
        // If the number is negative or ends with a zero (except zero itself),
        // it can't be a palindrome since numbers like 10, 20, etc., are not palindromic.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Reverse the integer until it's smaller than the reversed number
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check if the number is a palindrome
        // For even-length numbers, both original and reversed numbers are equal
        // For odd-length numbers, the middle digit doesn't matter, so we ignore it
        return x == reversed || x == reversed / 10;
    }

        public static void main(String[] args) {
            // Example usage
            int[] testCases = {121, -121, 10, 12321};
            Palindrome s = new Palindrome();

            for (int num : testCases) {
                System.out.println("Number: " + num);
                System.out.println("Is Palindrome: " + s.isPalindrome1(num));
                System.out.println();
            }
        }
    }



