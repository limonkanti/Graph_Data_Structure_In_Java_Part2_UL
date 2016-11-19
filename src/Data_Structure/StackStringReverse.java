package Data_Structure;

import java.util.*;

public class StackStringReverse {

    static void doReverse(Stack stack, String str) {
       // String st = (String) stack.push(str);
        char[] ch = str.toCharArray();
        
        String s = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            stack.push(ch[i]);
           // s = s + ch[i];
        }
       // stack.push(s);
        System.out.println(stack);

    }

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        //stack1.push("limon");
        doReverse(stack1,"limon");
    }
}
