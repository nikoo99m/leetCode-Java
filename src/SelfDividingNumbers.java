import java.util.ArrayList;
import java.util.List;

//A self-dividing number is a number that is divisible by every digit it contains.
//
// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
// A self-dividing number is not allowed to contain the digit zero.
//
// Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].


public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            if (isSelfDividing(num)) {
                result.add(num);
            }
        }

        return result;
    }

    private boolean isSelfDividing(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        SelfDividingNumbers solution = new SelfDividingNumbers();

        // Example usage:
        int left = 1;
        int right = 22;
        List<Integer> result = solution.selfDividingNumbers(left, right);

        System.out.println("Self-dividing numbers between " + left + " and " + right + ":");
        System.out.println(result);
    }
}
