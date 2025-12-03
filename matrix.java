import java.util.Scanner;
public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int countZero = 0;
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 0) {
                    countZero++;
                }
            }
        }
        if (countZero > (rows * cols) / 2) {
            System.out.println("It is a Sparse Matrix");
        } else {
            System.out.println("It is Not a Sparse Matrix");
        }
    }
}

output:
nter number of rows: 3
Enter number of columns: 3
Enter matrix elements:
0 5 0
0 0 7
0 0 0
It is a Sparse Matrix
