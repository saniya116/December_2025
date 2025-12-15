import java.util.*;
class RightRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter rotations: ");
        int k = sc.nextInt() % n;
        for (int r = 0; r < k; r++) {
            int last = arr[n - 1];
            for (int i = n - 1; i > 0; i--)
                arr[i] = arr[i - 1];
            arr[0] = last;
        }
       System.out.print("Rotated Array: ");
        for (int x : arr)
            System.out.print(x + " ");
    }
}

output:

Enter size: 5
1 2 3 4 5
Enter rotations: 2
Rotated Array: 4 5 1 2 3
