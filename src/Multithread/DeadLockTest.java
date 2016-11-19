package Multithread;

public class DeadLockTest {

    public static void main(String[] args) {
        final String s1 = "limon";
        final String s2 = "kanti";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (s1) {
                    System.out.println("Thread 1:locked resource 1");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    synchronized (s2) {
                        System.out.println("Thread 1:locked resource 2");
                    }
                }

            }

        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (s2) {
                    System.out.println("Thread 2:locked resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    synchronized (s1) {
                        System.out.println("Thread 2:locked resource 1");
                    }
                }

            }

        };
        t1.start();
        t2.start();

    }

}
