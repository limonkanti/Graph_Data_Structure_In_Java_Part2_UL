package Multithread;

class TestMultiNaming1 extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        TestMultiNaming1 t1 = new TestMultiNaming1();
        TestMultiNaming1 t2 = new TestMultiNaming1();
      
        t1.start();
        t2.start();

    }
}
