import java.util.Scanner;
class FirstNonRepeatedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.println("First non-repeated character: " + str.charAt(i));
                return;
            }
        }
        System.out.println("No non-repeated character found");
    }
}

output:
Input: programming
First non-repeated character: p
