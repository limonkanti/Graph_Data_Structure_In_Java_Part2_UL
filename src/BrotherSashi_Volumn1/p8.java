package BrotherSashi_Volumn1;

import sun.security.pkcs11.wrapper.Functions;

class p8 {

   int x=10;
  void disPlay()
  {
      System.out.println("Super");
              
  }

   int sum() {
       String s="123";
       String s1="123";
       int i=Integer.parseInt(s);
       long l=Long.valueOf(s);
       float f=Float.parseFloat(s1);
       System.out.println(i);
        return 2;
    }

}
class c extends p8
{
    
    void disPlay() {
        super.disPlay(); //To change body of generated methods, choose Tools | Templates.
    }
    int x=100;
        
    int sum() 
    {
        return 7;
          
    }
    public static void main(String args[])
    {
        p8 ob=new p8();
        ob.sum();
    }
    
}
