import java.util.*;
public class PalindromicWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }
        System.out.println("Number of palindromic words: " + count);
        sc.close();
    }
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
