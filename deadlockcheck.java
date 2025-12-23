import java.util.Scanner;
class DeadlockCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int[][] alloc = new int[p][r];
        int[][] req = new int[p][r];
        int[] avail = new int[r];
        boolean deadlock = false;
        for (int i = 0; i < p; i++)
            for (int j = 0; j < r; j++)
                alloc[i][j] = sc.nextInt();
        for (int i = 0; i < p; i++)
            for (int j = 0; j < r; j++)
                req[i][j] = sc.nextInt();
        for (int i = 0; i < r; i++)
            avail[i] = sc.nextInt();

        for (int i = 0; i < p; i++) {
            boolean canExecute = true;
            for (int j = 0; j < r; j++) {
                if (req[i][j] > avail[j]) {
                    canExecute = false;
                    break;
                }
            }
            if (!canExecute) {
                deadlock = true;
                break;
            }
        }
        if (deadlock)
            System.out.println("Deadlock Detected");
        else
            System.out.println("No Deadlock");
    }
}
