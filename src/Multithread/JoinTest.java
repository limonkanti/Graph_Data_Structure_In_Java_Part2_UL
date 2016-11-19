package Multithread;

public class JoinTest extends Thread{

    public void run() {
        // System.out.println("Thread");
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
        JoinTest ob = new JoinTest();
        JoinTest ob2 = new JoinTest();
        JoinTest ob3 = new JoinTest();
        System.out.println("First Thread Name is:\t"+ob.getName());
        System.out.println("Second Thread Name is:\t"+ob2.getName());
        System.out.println("Third Thread Name is:\t"+ob3.getName());
        ob.setName("Limon");
        System.out.println("First Thread Name is:\t"+ob.getName());
        ob.start();
        try
        {
            ob.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        ob2.start();
        ob3.start();
    }
}
