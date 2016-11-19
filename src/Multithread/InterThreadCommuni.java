package Multithread;

public class InterThreadCommuni {

    int amount = 1000;

    synchronized void withdrow(int amount) {
        System.out.println("going to withdrow....");
        if (amount > this.amount) {
            System.out.println("less balance");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
         
            System.out.println("withdrow completed");
            this.amount = this.amount - amount;
            
        
    }
    }

    synchronized void deposit(int amount) {
        System.out.println("going for deposit");
        this.amount += amount;
        System.out.println("deposit completed... ");
        notify();
    }
    public static void main(String[] args)
    {
        InterThreadCommuni ob=new InterThreadCommuni();
        new Thread()
        {
            public void run()
            {
                ob.withdrow(1500);
            }
        }.start();
        new Thread()
        {
            
            public void run()
            {
                ob.deposit(10000);
            }
        }.start();
        
    }

}
