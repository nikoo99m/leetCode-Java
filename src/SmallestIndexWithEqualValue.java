//Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist.
//
//x mod y denotes the remainder when x is divided by y.

public class SmallestIndexWithEqualValue {
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SmallestIndexWithEqualValue solver = new SmallestIndexWithEqualValue();

        int[] testArray1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] testArray2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] testArray3 = {5, 6, 7, 8, 9, 0, 1, 2, 3, 4};

        System.out.println("Test Array 1: " + solver.smallestEqual(testArray1));
        System.out.println("Test Array 2: " + solver.smallestEqual(testArray2));
        System.out.println("Test Array 3: " + solver.smallestEqual(testArray3));
    }
}

