public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hello world java programming";
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            result += rev + " ";
        }

        System.out.println(result.trim());
    }
}

outout:
olleH dlrow avaj gnimmargorp
