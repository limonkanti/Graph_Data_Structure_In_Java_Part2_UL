package Data_Structure;

import java.util.*;

public class StackCollection2 {
    

    static void push_item(Stack st, int i) {
        st.push(i);
        System.out.println("Push.\t" + i);
        System.out.println("Stack:\t" + st);

    }

    static void pop_item(Stack st) {
       // int a=(Integer)st.pop();
        System.out.println("Pop"+st.pop());
        System.out.println("Stack.\t" + st);
    }
    

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st);
        push_item(st, 100);
        push_item(st, 200);
        pop_item(st);
        pop_item(st);
        if(st.isEmpty())
        {
            System.out.println("Stack is Empty");
        }
         
    }

}
