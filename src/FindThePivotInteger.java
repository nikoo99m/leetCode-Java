//Given a positive integer n, find the pivot integer x such that:
//
// The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
// Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.
public class FindThePivotInteger {
    public int pivotInteger(int n) {
        int totalSum = (n * (n + 1)) / 2;
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum += i - 1;
            int rightSum = totalSum - leftSum - i;
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindThePivotInteger finder = new FindThePivotInteger();

        int n1 = 8;
        int result1 = finder.pivotInteger(n1);
        System.out.println("Pivot integer for n = " + n1 + " is: " + result1);

        int n2 = 5;
        int result2 = finder.pivotInteger(n2);
        System.out.println("Pivot integer for n = " + n2 + " is: " + result2);

        int n3 = 1;
        int result3 = finder.pivotInteger(n3);
        System.out.println("Pivot integer for n = " + n3 + " is: " + result3);

        int n4 = 10;
        int result4 = finder.pivotInteger(n4);
        System.out.println("Pivot integer for n = " + n4 + " is: " + result4);
    }
}
