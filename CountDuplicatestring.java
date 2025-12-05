import java.util.*;
class CountDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    freq++;
                }
            }
            if (freq > 1) {
                count++;
            }
        }
      System.out.println("Number of duplicate elements: " + count);
    }
}

output:
Enter size of array: 6
Enter elements:
2 3 2 5 3 3
Number of duplicate elements: 2
