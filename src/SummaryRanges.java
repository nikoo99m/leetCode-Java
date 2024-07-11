//A range [a,b] is the set of all integers from a to b (inclusive).
//
// Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
//
// Each range [a,b] in the list should be output as:
//
// "a->b" if a != b
// "a" if a == b


import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }

        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (nums[i - 1] == start) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SummaryRanges sr = new SummaryRanges();
        int[] nums1 = {0, 1, 2, 4, 5, 7};
        System.out.println(sr.summaryRanges(nums1)); // Output: [0->2, 4->5, 7]

        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
        System.out.println(sr.summaryRanges(nums2)); // Output: [0, 2->4, 6, 8->9]
    }
}

