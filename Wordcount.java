public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java is super easy to learn";
        int count = 0;

        String[] words = sentence.trim().split("\\s+");
        count = words.length;

        System.out.println("Sentence: " + sentence);
        System.out.println("Number of words = " + count);
    }
}

output:
Sentence: Java is super easy to learn
Number of words = 6
