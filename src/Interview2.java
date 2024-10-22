
/**
 * Perform a "rotation" of the integers inside data, modifying its contents.
 * "Rotation" means to shift the integers left or right, and those which drop off the
 * end of the array are added to the vacated positions at the other end.
 * <p>
 * Examples with the starting array {0, 1, 2, 3, 4, 5, 6}
 * e.g. rotate(1, true)   ->  {6, 0, 1, 2, 3, 4, 5}
 * e.g. rotate(2, true)   ->  {5, 6, 0, 1, 2, 3, 4}
 * e.g. rotate(3, false)  ->  {3, 4, 5, 6, 0, 1, 2}
 */
//You have used a function call, can you think of a way to do it within the function itself? It may be helpful to consider, what do you do when you want to `rotate(-3, true)`
public class Interview2 {
    public static void printArray(int[] data) {
        System.out.print("{ ");
        for (int i = 0; i < data.length; i++) {
            if (i > 0)
                System.out.print(", ");
            System.out.print(data[i]);
        }
        System.out.println(" }");
    }

    /**
     * @param n           The number of positions to
     *                    rotate the dataArray by
     * @param rotateRight If true, rotate elements to the right, otherwise, rotate
     *                    them to the left
     */

    public static void rotate(int[] data, int n, boolean rotateRight) {
        int length = data.length;
        if (n < 0) {
            n = -n;
            rotateRight = !rotateRight;
        }
        n = n % length;
//        if (rotateRight) {
//            reverse(data, 0, length - 1);
//            reverse(data, 0, n - 1);
//            reverse(data, n, length - 1);
//        } else {
////            reverse(data, 0, n - 1);
////            reverse(data, n, length - 1);
////            reverse(data, 0, length - 1);
//            rotate(data, length - n, true);
//        }

        if (!rotateRight) {
            n = length - n;
        }
        reverse(data, 0, length - 1);
        reverse(data, 0, n - 1);
        reverse(data, n, length - 1);
    }

    private static void reverse(int[] data, int start, int end) {
        while (start < end) {
            int j = data[start];
            data[start] = data[end];
            data[end] = j;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{0, 1, 2, 3, 4, 5, 6};
        printArray(data);
        // You will be given instructions on how to implement this
        System.out.println("after rotatin right by 2");
        rotate(data, 2, true);
        printArray(data);
        System.out.println("after rotatin left by 3");
        rotate(data, 3, false);
        printArray(data);
        rotate(data, -3, true);
        printArray(data);
    }

}