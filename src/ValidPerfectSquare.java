//Given a positive integer num, return true if num is a perfect square or false otherwise.
//
// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
//
// You must not use any built-in library function, such as sqrt.

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        if (num == 1) return true;
     for (int i = 2 ; i < num ; i++){
         if (num % i == 0){
             int n = num / i ;
             if (i == n){
                 return true;
             }

         }
     }
     return false;
}
    public static void main(String[] args) {
        ValidPerfectSquare vps = new ValidPerfectSquare();

        // Test cases
        int[] testNumbers = {1, 4, 9, 16, 25, 36, 49, 50, 64, 81, 100, 144, 200, 225, 256, 300};

        for (int num : testNumbers) {
            System.out.println("Is " + num + " a perfect square? " + vps.isPerfectSquare(num));
        }
    }}
