//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//
// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//
// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// Return k.
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[x] = nums[i];
                x++;
            }
        }

        return x;
    }
    public static void main(String[] args) {
        // Example usage
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        RemoveElement remover = new RemoveElement();
        int newSize = remover.removeElement(nums, val);

        System.out.println("New size of array after removing " + val + ": " + newSize);

        // Print the modified array
        System.out.print("Modified array: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}