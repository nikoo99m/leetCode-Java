//Given a square matrix mat, return the sum of the matrix diagonals.
//
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {

            sum += mat[i][i];

            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        MatrixDiagonalSum mds = new MatrixDiagonalSum();
        int[][] mat = {
                {1, 2, 3, 1},
                {4, 5, 6, 1},
                {7, 5, 2, 1},
                {5, 1, 5, 1}
        };
        int result = mds.diagonalSum(mat);
        System.out.println("The sum of the diagonals is: " + result);
    }

}
