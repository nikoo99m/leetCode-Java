//Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
public class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0 ){
            return n;
        }else return n*2;

    }
    public static void main(String[] args) {
        SmallestEvenMultiple sem = new SmallestEvenMultiple();

        // Test cases
        int[] testCases = {1, 2, 3, 4, 5, 6, 10, 15};

        for (int n : testCases) {
            System.out.println("The smallest even multiple of " + n + " is: " + sem.smallestEvenMultiple(n));
        }
    }
}
