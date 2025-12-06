import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        char[] a = s1.toLowerCase().replaceAll("\\s+", "").toCharArray();
        char[] b = s2.toLowerCase().replaceAll("\\s+", "").toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
