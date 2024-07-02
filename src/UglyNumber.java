//An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
//
//Given an integer n, return true if n is an ugly number.

public class UglyNumber {

    public static boolean isUgly(int n) {
        if (n <= 1) {
            return true;
        }

        int[] factors = {2, 3, 5};

        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }

        return n == 1;
    }

    public static void main(String[] args) {

        System.out.println(isUgly(102));
        System.out.println(isUgly(7));
        System.out.println(isUgly(14));
    }}
