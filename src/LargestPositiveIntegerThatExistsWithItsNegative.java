//Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.
//
//Return the positive integer k. If there is no such integer, return -1.
import java.util.HashSet;
import java.util.Set;
public class LargestPositiveIntegerThatExistsWithItsNegative {
        public int findMaxK(int[] nums) {
            Set<Integer> numSet = new HashSet<>();

            for (int num : nums) {
                numSet.add(num);
            }

            int largestK = -1;


            for (int num : nums) {
                if (num > 0 && numSet.contains(-num)) {
                    largestK = Math.max(largestK, num);
                }
            }

            return largestK;
        }

        public static void main(String[] args) {
            LargestPositiveIntegerThatExistsWithItsNegative solution = new LargestPositiveIntegerThatExistsWithItsNegative();

            int[] nums = {3, 2, -2, 5, -3};
            System.out.println(solution.findMaxK(nums));
        }
    }


