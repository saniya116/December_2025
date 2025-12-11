import java.util.*;
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        int maxFreq = 0;
        char maxChar = ' ';
        for (char ch : str.toCharArray()) {
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxChar = ch;
            }
        }
        System.out.println("Most frequent character: " + maxChar);
        System.out.println("Frequency: " + maxFreq);
    }
}
