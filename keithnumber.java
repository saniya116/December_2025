import java.util.*;
class KeithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int len = s.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = s.charAt(i) - '0';
      int sum;
        while (true) {
            sum = 0;
            for (int i = 0; i < len; i++)
                sum += arr[i];
            if (sum == n) {
                System.out.println("Keith Number");
                break;
            }
            if (sum > n) {
                System.out.println("Not a Keith Number");
                break;
            }
            for (int i = 0; i < len - 1; i++)
                arr[i] = arr[i + 1];
            arr[len - 1] = sum;
        }
    }
}

output:
Enter number: 197
Keith Number
