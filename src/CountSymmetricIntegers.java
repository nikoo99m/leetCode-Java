//You are given two positive integers low and high.
//
// An integer x consisting of 2 * n digits is symmetric if the sum of the first n digits of x is equal to the sum of the last n digits of x. Numbers with an odd number of digits are never symmetric.
//
// Return the number of symmetric integers in the range [low, high].
public class CountSymmetricIntegers {
    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int num = low; num <= high; num++) {
            if (isSymmetric(num)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isSymmetric(int num) {
        int length = (int) Math.log10(num) + 1;

        if (length % 2 != 0) {
            return false;
        }

        int half = length / 2;
        int firstHalfSum = 0, secondHalfSum = 0;
        int divisor = (int) Math.pow(10, half);

        int firstHalf = num / divisor;
        int secondHalf = num % divisor;

        while (firstHalf > 0) {
            firstHalfSum += firstHalf % 10;
            firstHalf /= 10;
        }

        while (secondHalf > 0) {
            secondHalfSum += secondHalf % 10;
            secondHalf /= 10;
        }

        return firstHalfSum == secondHalfSum;
    }

    public static void main(String[] args) {
        int low = 10;
        int high = 200;

        int result = countSymmetricIntegers(low, high);
        System.out.println("Number of symmetric integers: " + result);
    }
}

