package Multithread;

public class ThreadSleep extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        ThreadSleep ob = new ThreadSleep();

     //   ThreadSleep ob1 = new ThreadSleep();
        ob.start();
        ob.start();
        // ob1.run();

    }
}
