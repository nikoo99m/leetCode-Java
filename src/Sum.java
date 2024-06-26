import java.util.HashMap;
import java.util.HashMap;

public class Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] s = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    s[0] = i;
                    s[1] = j;
                    return s;
                }
            }
        }

        return s;
    }



    public class Sum2 {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            return new int[0]; // No solution found
        }
    }


    public static void main(String[] args) {
        Sum s = new Sum();
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] result = s.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}

