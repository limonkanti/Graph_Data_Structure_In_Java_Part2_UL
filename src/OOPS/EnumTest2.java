
package OOPS;

enum Season
{
    WINTER(10),
    SUMMER(20);  
    private int value;
    private Season(int value)
    {
        this.value=value;
    }
   public int disPlay()
    {
        return value;
    }
}
public class EnumTest2 
{
    public static void main(String args[])
    {
        Season dir=Season.SUMMER;
        System.out.println(dir.disPlay());
    }
   
}
