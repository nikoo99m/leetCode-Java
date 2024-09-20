//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//
//Note that multiple kids can have the greatest number of candies.

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

            int maxCandies = 0;
            for (int candy : candies) {
                if (candy > maxCandies) {
                    maxCandies = candy;
                }
            }

            List<Boolean> result = new ArrayList<>();

            for (int candy : candies) {
                if (candy + extraCandies >= maxCandies) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            }

            return result;
        }

        public static void main(String[] args) {
            KidsWithTheGreatestNumberOfCandies  solution = new KidsWithTheGreatestNumberOfCandies ();

            int[] candies1 = {2, 3, 5, 1, 3};
            int extraCandies1 = 3;
            List<Boolean> result1 = solution.kidsWithCandies(candies1, extraCandies1);
            System.out.println("Test case 1: " + result1);

            int[] candies2 = {4, 2, 1, 1, 2};
            int extraCandies2 = 1;
            List<Boolean> result2 = solution.kidsWithCandies(candies2, extraCandies2);
            System.out.println("Test case 2: " + result2);

            int[] candies3 = {12, 1, 12};
            int extraCandies3 = 10;
            List<Boolean> result3 = solution.kidsWithCandies(candies3, extraCandies3);
            System.out.println("Test case 3: " + result3);
        }
    }

