package Multithread;

class TestMultiPriority1 extends Thread{
    public void run()
    {
        System.out.println("Name of thread\t"+Thread.currentThread().getName());
    }

    public static void main(String args[]) {

       TestMultiPriority1 t=new TestMultiPriority1();
       t.start();
       t.setName("Limon");
       
       System.out.println(t.getName());

    }
}
