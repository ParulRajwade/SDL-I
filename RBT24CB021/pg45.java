//Create a thread by implementing Runnable interface
class pg45 implements Runnable {
    public void run() {
        System.out.println("Runnable thread running...");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new pg45());
        t.start();
    }
}
