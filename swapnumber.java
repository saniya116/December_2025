public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping:");
        System.out.println("a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}

output:
Before Swapping:
a = 10, b = 20
After Swapping:
a = 20, b = 10
