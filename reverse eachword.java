import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }
            System.out.print(rev + " ");
        }
    }
}

output:
Enter a sentence: Java is fun
avaJ si nuf
