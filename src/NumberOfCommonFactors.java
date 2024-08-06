//Given two positive integers a and b, return the number of common factors of a and b.
//
//An integer x is a common factor of a and b if x divides both a and b.


import java.util.ArrayList;
import java.util.List;

public class NumberOfCommonFactors {
    // better solution.
    public int commonFactors2(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
    public int commonFactors(int a, int b) {
        int count = 0;
        List<Integer> factorA = getFactors(a);
        List<Integer> factorB = getFactors(b);
        for( int i = 0 ; i < factorA.size() ; i++){
            for (int j = 0 ; j < factorB.size() ; j++){
                if (factorA.get(i) == factorB.get(j)){
                    count ++;
                }
            }
        }
        return count;

    }
    public List<Integer> getFactors(int num){
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                factorsList.add(i);
            }
        }
        return factorsList;

    }
    public static void main(String[] args) {
        NumberOfCommonFactors numberOfCommonFactors = new NumberOfCommonFactors();

        // Example test cases
        int a = 12;
        int b = 18;

        int result = numberOfCommonFactors.commonFactors(a, b);
        System.out.println("Number of common factors of " + a + " and " + b + ": " + result);

        // Additional test case
        int c = 100;
        int d = 75;

        int result2 = numberOfCommonFactors.commonFactors(c, d);
        System.out.println("Number of common factors of " + c + " and " + d + ": " + result2);
    }}
