import java.util.*;
public class KeithNumber {
    public static void main(String[] args) {
        int n = 197, temp = n;
        ArrayList<Integer> list = new ArrayList<>();
         while (temp > 0) {
            list.add(0, temp % 10);
            temp /= 10;
        }
        int sum = 0;
        while (sum < n) {
            sum = 0;
            for (int x : list)
                sum += x;
            list.remove(0);
            list.add(sum);
        }
if (sum == n)
            System.out.println(n + " is a Keith Number");
        else
            System.out.println(n + " is not a Keith Number");
    }
}

output:
197 is a Keith Number
