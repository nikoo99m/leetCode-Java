
public class CountNegativeNumbersInASortedMatrix {
    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int row = m - 1;
        int col = 0;
        int count = 0;

        while (row >= 0 && col < n){
            if (grid[row][col] < 0){
                count += n - col;
                row--;
            }else{
                col++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {
                {5, 3, 2, -1},
                {3, 2, -1, -2},
                {2, 1, 0, -3},
                {1, -1, -2, -4}
        };

        System.out.println("Number of negative numbers: " + countNegatives(grid));

    }
}

