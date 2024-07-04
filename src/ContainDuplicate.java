//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {

            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        return true;
                    }
                }
            }
            return false;
        }

    public static void main(String[] args) {
        // Create an instance of the ContainDuplicate class
        ContainDuplicate containDuplicateInstance = new ContainDuplicate();

        // Test cases
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 4};
        int[] nums3 = {1};
        int[] nums4 = {};

        // Check for duplicates and print results
        System.out.println("nums1 contains duplicates: " + containDuplicateInstance.containsDuplicate(nums1));
        System.out.println("nums2 contains duplicates: " + containDuplicateInstance.containsDuplicate(nums2));
        System.out.println("nums3 contains duplicates: " + containDuplicateInstance.containsDuplicate(nums3));
        System.out.println("nums4 contains duplicates: " + containDuplicateInstance.containsDuplicate(nums4));
    }
}
