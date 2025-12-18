import java.util.Scanner;
class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;
        if (String.valueOf(square).endsWith(String.valueOf(num)))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}

output:
25
Automorphic Number
