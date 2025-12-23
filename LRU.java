import java.util.*;
class LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int frames = sc.nextInt();
        int pages = sc.nextInt();
        int[] page = new int[pages];
        for (int i = 0; i < pages; i++)
            page[i] = sc.nextInt();
        LinkedList<Integer> memory = new LinkedList<>();
        int faults = 0;
        for (int p : page) {
            if (!memory.contains(p)) {
                faults++;
                if (memory.size() == frames)
                    memory.removeFirst();
            } else {
                memory.remove((Integer) p);
            }
            memory.add(p);
        }
        System.out.println("Page Faults: " + faults);
    }
}

output:
Page Faults: 6
