//Create a thread by extending Thread class
class pg44 extends Thread {
    public void run() {
        System.out.println("Thread running...");
    }

    public static void main(String[] args) {
        pg44 t = new pg44();
        t.start();
    }
}
