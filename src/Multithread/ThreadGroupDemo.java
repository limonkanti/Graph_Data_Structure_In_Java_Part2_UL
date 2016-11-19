package Multithread;

public class ThreadGroupDemo implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        ThreadGroupDemo ob = new ThreadGroupDemo();
        ThreadGroup tg = new ThreadGroup("Parent Thread Group");
        Thread t1 = new Thread(tg, ob, "One");
        t1.start();
        Thread t2 = new Thread(tg, ob, "two");
        t2.start();
        System.out.println("Thread group name\t" + tg.getName());
        tg.list();

    }

}
