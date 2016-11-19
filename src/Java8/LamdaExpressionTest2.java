
package Java8;


public class LamdaExpressionTest2 
{
    final static String s="Hello.....";
    interface Message{
        void showMessage(String sms);
    }
    
    public static void main(String args[]) {
        System.out.println("Java 8 test");
        
      Message ob=(message)->
              System.out.println(s+message);
      ob.showMessage("i love java");

    }
    
}
