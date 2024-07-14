//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
public class MissingNumber {
    public static int missingNumber(int[] nums) {
       int n = nums.length;
       int expectedSum = n*(n + 1)/2;
       int actualSum = 0;
       for (int num : nums) {
           actualSum += num;
       }
       return expectedSum - actualSum;
    }
    public static void main(String[] args) {


        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        int[] nums4 = {0};

        // Print the results
        System.out.println("Missing number in [3, 0, 1]: " + missingNumber(nums1));
        System.out.println("Missing number in [0, 1]: " + missingNumber(nums2));
        System.out.println("Missing number in [9,6,4,2,3,5,7,0,1]: " + missingNumber(nums3));
        System.out.println("Missing number in [0]: " + missingNumber(nums4));
    }
    }
