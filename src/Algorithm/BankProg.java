
package Algorithm;


public class BankProg 
{
    int amount;
    public void deposit(int amount)
    {
        this.amount+=amount;
        
    }
    public int getBalance()
    {
        return amount;
    }
    public boolean withdrow(int amount)
    {
        boolean wirh=false;
        if((amount>this.amount))
        {
            System.out.println("Amount is much");
            return false;
        }
        else if((this.amount-amount)<=100)
        {
            System.out.println("you must have 100 in your account");
            return false;
        }
        else
        {
            this.amount=this.amount-amount;
            System.out.println("you have"+this.amount);
        }
        return true;
    }
    public static void main(String[] args) 
    {
        BankProg ob=new BankProg();
        ob.deposit(400);
        System.out.println(ob.getBalance());
        ob.deposit(100);
        System.out.println(ob.getBalance());
        ob.withdrow(700);
      //  System.out.println(ob.withdrow(amount));
        
    }
    
}
