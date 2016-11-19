
package interview_coding_java2novice;

public class SingletonClass_4 
{
    private static SingletonClass_4 ob=new SingletonClass_4();
    private SingletonClass_4()
    {
        
    }
   public static SingletonClass_4 getSingleton()
    {
        return ob;
    }
    public void display()
    {
        System.out.println("single to class!!!!!!");
    }
    public static void main(String[] args) 
    {
        SingletonClass_4 ob=SingletonClass_4.getSingleton();
        //SingletonClass_4 ob1=getSingleton();
        ob.display();
        
    }
}
