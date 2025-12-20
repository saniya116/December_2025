import java.util.Scanner;
public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, product = 1, digit;
        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num = num / 10;
        }
        if (sum == product) {
            System.out.println("It is a Spy Number");
        } else {
            System.out.println("It is NOT a Spy Number");
        }
    }
}

output:
Enter a number: 123
It is a Spy Number
