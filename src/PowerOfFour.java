//Given an integer n, return true if it is a power of four. Otherwise, return false.
//
// An integer n is a power of four, if there exists an integer x such that n == 4x
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n == 1){
            return true;
        }
        while(n > 1){
            if (n % 4 != 0){
                return false;
            }
            n /= 4;
        }
        return true;}
    public static void main(String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();


        int[] testCases = {1, 4, 16, 64, 2, 8, 32, 0, -4};

        for (int n : testCases) {
            System.out.println("Is " + n + " a power of four? " + powerOfFour.isPowerOfFour(n));
        }
}}
