
package String;

public class String_Swaping_2_array_using_array
{
    
    public static void main(String args[]) 
     {
        String ary[] = {"A", "B"};
        String ary2[]={"C","D"};
        int ary3[]=new int[10];
        String temp;
       System.out.println("Swapping Technique");
        for(int i=0;i<2;i++)
        {
            temp=ary[i];
            ary[i]=ary2[i];
            ary2[i]=temp;
        }
        System.out.println("After Swapping ary is");
        for(int i=0;i<2;i++)
        {
            System.out.println(ary[i]);
        }
        System.out.println("After Swapping ary2 is");
       for(int i=0;i<2;i++)
        {
            System.out.println(ary2[i]);
        }

    }
    
}
