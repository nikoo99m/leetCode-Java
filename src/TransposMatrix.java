//Given a 2D integer array matrix, return the transpose of matrix.
//
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.


public class TransposMatrix {
        public int[][] transpose(int[][] matrix) {

            int rows = matrix.length;
            int cols = matrix[0].length;

            int[][] transposedMatrix = new int[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transposedMatrix[j][i] = matrix[i][j];
                }
            }

            return transposedMatrix;
        }

    public static void main(String[] args) {

        TransposMatrix solution = new TransposMatrix();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {2, 5, 8}
        };

        int[][] transposedMatrix = solution.transpose(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
