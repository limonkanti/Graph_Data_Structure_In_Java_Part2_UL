package data_structure_stack_queue_priorityQu_Deque;

import java.util.Stack;

public class StringReverseUsingStack {

    public void pushData(Stack s, String str) {

        char c[] = str.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            s.push(c[i]);
        }

        // System.out.print("push:\t"+s + "\t");
        System.out.println(s);

    }

    public static void main(String[] args) {
        StringReverseUsingStack ob = new StringReverseUsingStack();
        Stack s = new Stack();
        ob.pushData(s, "12345");
         //ob.pushData(s, null);

    }

}
