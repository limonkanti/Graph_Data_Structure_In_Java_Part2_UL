package Multithread;

public class JoinTest2 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        JoinTest2 ob = new JoinTest2();

        JoinTest2 ob1 = new JoinTest2();

        JoinTest2 ob2 = new JoinTest2();

        ob.start();
        try {
            ob.join(1500);
        } catch (Exception e) {
            System.out.println(e);

        }

        ob1.start();
        ob2.start();
    }
}
