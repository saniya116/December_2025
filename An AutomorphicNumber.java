import java.util.*;
class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        String n = String.valueOf(num);
        String s = String.valueOf(square);
        if (s.endsWith(n)) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is NOT an Automorphic Number");
        }
    }
}

output:
Enter a number: 76
76 is an Automorphic Number
