//Given an integer n, return true if it is a power of three. Otherwise, return false.
//
//An integer n is a power of three, if there exists an integer x such that n == 3x.

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0){
            return false;
        }
        if (n == 1){
            return true;
        }
        while(n > 1){
            if (n % 3 != 0){
                return false;
            }
            n /= 3;
        }
        return true;

    }
    public static void main(String[] args) {
        PowerOfThree powerOfThree = new PowerOfThree();

        int[] testNumbers = {1, 3, 9, 27, 81, 0, -3, 10, 45};

        for (int number : testNumbers) {
            System.out.println("Is " + number + " a power of three? " + powerOfThree.isPowerOfThree(number));
        }
}}
