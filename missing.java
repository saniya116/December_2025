import java.util.Scanner;
class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int total = n * (n + 1) / 2;
        System.out.println("Missing number: " + (total - sum));
    }
}

output:
Missing number: 3
