import java.util.Scanner;
class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        k = k % n;
        for (int i = n - k; i < n; i++)
            System.out.print(arr[i] + " ");
        for (int i = 0; i < n - k; i++)
            System.out.print(arr[i] + " ");
    }
}
Input:
5
1 2 3 4 5
2

Output:
4 5 1 2 3
