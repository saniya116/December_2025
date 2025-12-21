import java.util.Scanner;
class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int sum = 0;
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                if (i == j || i + j == n - 1)
                    sum += mat[i][j];
            }
        }
       System.out.println("Sum of diagonals = " + sum);
    }
}

output:
Enter matrix size: 3
Enter matrix elements:
1 2 3
4 5 6
7 8 9
Sum of diagonals = 25
