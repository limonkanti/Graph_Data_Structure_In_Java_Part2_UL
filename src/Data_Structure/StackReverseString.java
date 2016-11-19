package Data_Structure;

public class StackReverseString {

    private int maxsize;
    private String stackArray[];
    private int top;

    StackReverseString(int size) {
        maxsize = size;
        stackArray = new String[maxsize];
        top = -1;

    }

    public void push(String pushData) {
        stackArray[++top] = pushData;

    }

    public void doReverse() {
       
    }

}

class MyStack1 {
 String va;
    MyStack1(String s) 
    {
        va=s;

    }

    public static void main(String args[]) {
        String input = "Java Source and Support";
        String output;
        MyStack1 m = new MyStack1("Java");
        StackReverseString ob = new StackReverseString(1);
        ob.push("java");
        ob.doReverse();

    }
}
