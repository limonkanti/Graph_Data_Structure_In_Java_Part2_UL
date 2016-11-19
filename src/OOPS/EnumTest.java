package OOPS;

enum Directions
{
    North,
    South,
    East,
    West
   
}
class EnumTest
{
    Directions dir;
    EnumTest(Directions dir)
    {
        this.dir=dir;
    }
    public void getMyDirection()
    {
        switch(dir)
        {
            case North:
            System.out.println("Direction is North");   
            break;
            case South:
            System.out.println("Direction is South");   
            break;
            default:
            System.out.println("No Direction");   
            break;    
        }
    }
    
    
     public static void main(String args[])
     {
        /* for(Directions dir:Directions.values())
         {
             System.out.println(dir);
             
         }*/
         EnumTest ob=new EnumTest(Directions.North);
         ob.getMyDirection();
         
     }
    
    
}
