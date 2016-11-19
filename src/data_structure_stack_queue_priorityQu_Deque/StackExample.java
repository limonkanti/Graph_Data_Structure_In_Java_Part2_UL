package data_structure_stack_queue_priorityQu_Deque;

import java.util.*;

public class StackExample {

    public void pushData(Stack s, int i)
    {

        s.push(i);
        System.out.print("push:\t"+s + "\t");
        System.out.println();

    }

    public void popData(Stack s) 
    {
        int i=(int)s.pop();
       
        System.out.print("pop:\t"+i);
        System.out.println();
        

    }
    public void searchData(Stack s,int i)
    {
        //Stack s=new Stack();
        System.out.println(s.search(i));
        
        
    }

    public void getPeek(Stack s)
    {
        //Stack s=new Stack();
        System.out.println("The top element\t"+s.peek());
        
        
    }
    public void checkEmpty(Stack s)
    {
        System.out.println(s.empty());
    }
    

    public static void main(String[] args) {
        StackExample ob = new StackExample();
        Stack s = new Stack();
        System.out.println("phsh data");
        ob.pushData(s, 10);
        ob.pushData(s, 20);
        ob.pushData(s, 30);
        ob.pushData(s, 40);
        System.out.println("pop data");
      //  ob.popData(s);
       // ob.popData(s);
        System.out.println("Search");
        ob.searchData(s,10);
        ob.getPeek(s);
        ob.checkEmpty(s);
       

    }

}
