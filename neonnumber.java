import java.util.Scanner;
class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        if (sum == num)
            System.out.println(num + " is a Neon Number");
        else
            System.out.println(num + " is Not a Neon Number");
    }
}
Input: 9

output:
9 is a Neon Number
