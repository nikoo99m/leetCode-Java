//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
public class SingleNumber {
    public int singleNumber1(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    public int singleNumber(int[] nums) {
        boolean flag = false;
        int num = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = i + 1 ; j < nums.length-1 ; j++){
                if (nums[i] == nums[j+1]){
                    flag = true;
                    break;
                } else{ num = nums[i];
                }
            }
        }

    return num;
    }


    public static void main(String[] args) {
        SingleNumber singleNumberFinder = new SingleNumber();

        // Example array
        int[] nums = {4, 1, 2, 1, 2, 4, 7, 6, 6};

        // Finding the single number
        int result = singleNumberFinder.singleNumber(nums);

        // Printing the result
        System.out.println("The single number is: " + result);
    }
}
