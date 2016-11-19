
package String;


public class String_convert_lower 
{
     public static void main(String args[])
     {
         String name="LIMON KANTI dey";
         System.out.println(name.toLowerCase());
         //convert char array
         String s[]={"limon","KANTI","dey"};
         for(int i=0;i<s.length;i++)
         {
             if(s[i]=="KANTI")
             {
                 System.out.println(s[i].toLowerCase());
             }
             else
             {
                 System.out.println(s[i]);
             }
         } 
         //convert string to char array
         char ch[]=name.toLowerCase().toCharArray();
         int length=ch.length;
         for(int i=0;i<length;i++)
         {
             System.out.println(ch[i]);
             
         }
     
     }
    
}
