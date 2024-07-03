import java.util.ArrayList;

//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//
// F(0) = 0, F(1) = 1
// F(n) = F(n - 1) + F(n - 2), for n > 1.
// Given n, calculate F(n).


public class FibonacciNumber {
    public int fib(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        int a = 0;
        int b = 1;
        array.add(a);
        array.add(b);
        for (int i = 2; i <= n; i++) {
            array.add(array.get(i - 1) + array.get(i - 2));
        }
        return array.get(n);
    }

    public static void main(String[] args) {
        FibonacciNumber fibCalc = new FibonacciNumber();

        // Test cases
        int n1 = 2;
        System.out.println("fib(" + n1 + ") = " + fibCalc.fib(n1)); // Output: 0

        int n2 = 4;
        System.out.println("fib(" + n2 + ") = " + fibCalc.fib(n2)); // Output: 1

        int n3 = 2;
        System.out.println("fib(" + n3 + ") = " + fibCalc.fib(n3)); // Output: 1

        int n4 = 3;
        System.out.println("fib(" + n4 + ") = " + fibCalc.fib(n4)); // Output: 2

        int n5 = 10;
        System.out.println("fib(" + n5 + ") = " + fibCalc.fib(n5)); // Output: 55
    }
}

