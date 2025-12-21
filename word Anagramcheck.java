import java.util.Scanner;
class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        int[] count = new int[256];
        for (char c : s1.toCharArray())
            count[c]++;
        for (char c : s2.toCharArray())
            count[c]--;
        boolean isAnagram = true;
        for (int i : count) {
            if (i != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram)
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are NOT Anagrams");
    }
}

output:
Enter first string: listen
Enter second string: silent
Strings are Anagrams
