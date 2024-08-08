//Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
//
//The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
public class FindGreatestCommonDivisorOfArray {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return GCD(min, max);
    }

    public int GCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        return GCD(num2 % num1, num1);
    }
    public static void main(String[] args) {
        FindGreatestCommonDivisorOfArray gcdFinder = new FindGreatestCommonDivisorOfArray();
        int[] nums = {3, 5, 6, 9, 10};
        int result = gcdFinder.findGCD(nums);
        System.out.println("The GCD of the smallest and largest number in the array is: " + result);
    }

}
