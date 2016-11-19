package Multithread;

public class TestUsingRunable implements Runnable {

    public void run() {
        System.out.println("Thread");

    }

    

    public static void main(String args[]) {
        TestUsingRunable ob = new TestUsingRunable();
        Thread t = new Thread(ob);

        // ob.run1();
        t.start();
    }

}
