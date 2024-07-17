import java.util.ArrayList;
import java.util.List;

//Given an integer n, return a string array answer (1-indexed) where:
//
//  answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//  answer[i] == "Fizz" if i is divisible by 3.
//  answer[i] == "Buzz" if i is divisible by 5.
//  answer[i] == i (as a string) if none of the above conditions are true.


public class FizzBazz {
    public List<String> fizzBuzz(int n) {
        List<String> array = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                array.add("FizzBuzz");
            } else if (i % 3 == 0) {
                array.add("Fizz");
            } else if (i % 5 == 0) {
                array.add("Buzz");
            } else {
                array.add(String.valueOf(i));
            }
        }
        return array;
    }
    public static void main(String[] args) {
        FizzBazz solution = new FizzBazz();
        int n = 15;
        List<String> result = solution.fizzBuzz(n);

        for (String s : result) {
            System.out.println(s);
        }
}}
