
package List_ArrayList;

import java.util.ArrayList;

public class Compare2ArrayList 
{
    public static void main(String [] args)
     {
          ArrayList<String> al1= new ArrayList<String>();
         
          al1.add("How are you");
          al1.add("Good Morning");
          al1.add("bye");
          al1.add("Good night");

          ArrayList<String> al2= new ArrayList<String>();
          al2.add("Howdy");
          al2.add("Good Evening");
          al2.add("bye");
          al2.add("Good night");
          ArrayList<String> al3= new ArrayList<String>();
          for(String x:al1)
          {
              al3.add(al2.contains(x)?"Yes":"No");
              System.out.println(al3);
          }
          
     }
    
}
