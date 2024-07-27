//Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.
//
//After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.
public class SumOfDigitsInBaseK {
    public int sumBase(int n, int k) {
        int sum = 0;

        while (n > 0) {
            sum += n % k;
            n /= k;
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfDigitsInBaseK sbd = new SumOfDigitsInBaseK();

        // Test cases
        System.out.println(sbd.sumBase(34, 6));
        System.out.println(sbd.sumBase(10, 10));
        System.out.println(sbd.sumBase(255, 16));
    }
}