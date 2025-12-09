import java.util.*;
public class HappyNumber {
    public static int sumOfSquares(int num) {
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = num;
        while(result != 1 && result != 4) {
            result = sumOfSquares(result);
        }
        if(result == 1)
            System.out.println(num + " is a Happy Number 😄");
        else
            System.out.println(num + " is not a Happy Number 😐");
    }
}
outout:
Enter a number: 19
19 is a Happy Number 😄
