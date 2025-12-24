class Buffer {
    int item;
    boolean produced = false;
    synchronized void produce(int x) throws InterruptedException {
        while (produced)
            wait();
        item = x;
        produced = true;
        System.out.println("Produced: " + item);
        notify();
    }
    synchronized void consume() throws InterruptedException {
        while (!produced)
            wait();
        System.out.println("Consumed: " + item);
        produced = false;
        notify();
    }
}
class PC {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++)
                    b.produce(i);
            } catch (Exception e) {}
        }).start();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++)
                    b.consume();
            } catch (Exception e) {}
        }).start();
    }
}
