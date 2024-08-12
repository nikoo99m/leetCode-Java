//You are given a positive integer array nums.
//
// The element sum is the sum of all the elements in nums.
// The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
// Return the absolute difference between the element sum and digit sum of nums.
//
// Note that the absolute difference between two integers x and y is defined as |x - y|.


public class DifferenceBetweenElementSumAndDigitSumOfAnArray {

        public static int calculateElementSum(int[] nums) {
            int elementSum = 0;
            for (int num : nums) {
                elementSum += num;
            }
            return elementSum;
        }

        public static int calculateDigitSum(int[] nums) {
            int digitSum = 0;
            for (int num : nums) {
                digitSum += sumDigits(num);
            }
            return digitSum;
        }

        public static int sumDigits(int num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }

        public static int differenceBetweenElementAndDigitSum(int[] nums) {
            int elementSum = calculateElementSum(nums);
            int digitSum = calculateDigitSum(nums);
            return Math.abs(elementSum - digitSum);
        }

        public static void main(String[] args) {
            int[] nums = {123, 456, 789};
            int difference = differenceBetweenElementAndDigitSum(nums);
            System.out.println("The absolute difference is: " + difference);
        }
    }
