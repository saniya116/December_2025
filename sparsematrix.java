 public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 5, 0},
            {0, 0, 7},
            {0, 0, 0}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        int countZero = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    countZero++;
                }
            }
        }
        if (countZero > (rows * cols) / 2) {
            System.out.println("It is a Sparse Matrix");
        } else {
            System.out.println("It is not a Sparse Matrix");
        }
    }
}

output:
 It is a Sparse Matrix
