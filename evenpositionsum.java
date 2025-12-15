import java.util.Scanner;
class EvenPositionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        int sum = 0;
        for (int i = 1; i < num.length(); i += 2) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        System.out.println("Sum of digits at even positions: " + sum);
    }
}

output:
Enter a number: 12345
Sum of digits at even positions: 6
