public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 25;
        int square = num * num;

        boolean isAutomorphic = Integer.toString(square).endsWith(Integer.toString(num));

        if (isAutomorphic) {
            System.out.println(num + " is an Automorphic number");
        } else {
            System.out.println(num + " is not an Automorphic number");
        }
    }
}
25 is an Automorphic number
