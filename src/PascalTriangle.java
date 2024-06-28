import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1);

            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currRow.add(1);

            triangle.add(currRow);
        }

        return triangle;
    }
    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        List<List<Integer>> result = pt.generate(6);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}







