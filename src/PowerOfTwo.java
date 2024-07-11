//Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//An integer n is a power of two, if there exists an integer x such that n == 2x.

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if ( n == 1){
            return true;
        }
        while (n > 1){
            if (n % 2 != 0){
                return false;
            }
            n /= 2;
        }
        return true;

    }
    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();

        int[] testCases = {1, 2, 3, 4, 5, 16, 18, 32, 64, 100};

        for (int n : testCases) {
            System.out.println("Is " + n + " a power of two? " + powerOfTwo.isPowerOfTwo(n));
        }
    }
}
