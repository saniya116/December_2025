class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }
        for (char c : str.toCharArray()) {
            if (freq[c] == 1) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }
        System.out.println("No non-repeating character found");
    }
}

output:
First non-repeating character: w
