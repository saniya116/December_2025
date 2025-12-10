public class StrongNumbers {
    public static void main(String[] args) {
        for (int num = 1; num <= 500; num++) {
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }
             if (sum == num) {
                System.out.println(num);
            }
        }
    }
  public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
u
}

output:
1
2
145
