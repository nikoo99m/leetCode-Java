//A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
//
// You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
//
//Return the number of indices where heights[i] != expected[i].

import java.util.Arrays;

public class HeightChecker {

    // Method to sort a copy of the heights array
    public static int[] sortedHeights(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[j] < sorted[i]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

    public int heightChecker(int[] heights) {
        int[] sorted = sortedHeights(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (sorted[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {5, 1, 2, 3, 4};
        HeightChecker hc = new HeightChecker();
        int result = hc.heightChecker(heights);
        System.out.println("Number of students out of order: " + result);
    }
}