//Given an array nums of size n, return the majority element.
//
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int x = nums.length / 2;
        int count;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > x) {
                return nums[i];
            }
        }
        return -1;
    }
    public int majorityElement1(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }


    public static void main(String[] args) {
        MajorityElement majorityElementFinder = new MajorityElement();

        // Test cases
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        // Finding majority elements
        int result1 = majorityElementFinder.majorityElement1(nums1);
        int result2 = majorityElementFinder.majorityElement1(nums2);

        // Output results
        System.out.println("The majority element in nums1 is: " + result1);
        System.out.println("The majority element in nums2 is: " + result2);
    }
}
