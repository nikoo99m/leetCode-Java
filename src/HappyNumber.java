//Write an algorithm to determine if a number n is happy.
//
//  A happy number is a number defined by the following process:
//
//  Starting with any positive integer, replace the number by the sum of the squares of its digits.
//  Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//  Those numbers for which this process ends in 1 are happy.
//  Return true if n is a happy number, and false if not.

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            sum += digit * digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        int testNumber = 100;

        if (happyNumber.isHappy(testNumber)) {
            System.out.println(testNumber + " is a happy number.");
        } else {
            System.out.println(testNumber + " is not a happy number.");
        }
    }
}