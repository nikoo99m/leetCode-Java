import java.util.ArrayList;
import java.util.List;

//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1; // Get the correct index
            nums[index] = -Math.abs(nums[index]); // Mark the index negative
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray finder = new FindAllNumbersDisappearedInAnArray();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missingNumbers = finder.findDisappearedNumbers(nums);
        System.out.println("Missing numbers: " + missingNumbers);
    }
}

