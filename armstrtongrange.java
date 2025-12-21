import java.util.Scanner;
class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers:");
        for (int i = start; i <= end; i++) {
            int num = i, sum = 0, digits = 0;
            int temp = num;
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
            temp = num;
            while (temp != 0) {
                int r = temp % 10;
                sum += Math.pow(r, digits);
                temp /= 10;
            }
            if (sum == num)
                System.out.print(num + " ");
        }
    }
}

output:
Enter start number: 1
Enter end number: 500
Armstrong numbers:
1 153 370 371 407
