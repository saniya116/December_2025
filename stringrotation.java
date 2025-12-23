import java.util.Scanner;
class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.length() == s2.length() && (s1 + s1).contains(s2))
            System.out.println("Rotation");
        else
            System.out.println("Not Rotation");
    }
}
Input:
abcd
cdab
Output:
Rotation
