public class SumMultiples {
    public static int sumOfMultiples(int n) {
        int totalSum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                totalSum += i;
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("The sum of all numbers divisible by 3, 5, or 7 between 1 and " + n + " is: " + sumOfMultiples(n));
    }
}

