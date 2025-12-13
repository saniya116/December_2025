import java.util.Scanner;
class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();  
        System.out.print("Enter rotations: ");
        int k = sc.nextInt();
        String s = Integer.toString(num);
        k = k % s.length();
        String result = s.substring(s.length() - k) + s.substring(0, s.length() - k);
        System.out.println("Rotated Number: " + result);
    }
}

output:
Enter number: 12345
Enter rotations: 2
Rotated Number: 45123
