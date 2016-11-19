package Data_Structure;

public class Stack1 {

    private int maxsize;
    private int stackArray[];
    private int top;

    Stack1(int size) {
        maxsize = size;
        stackArray = new int[maxsize];
        top = -1;

    }

    public void push(int pushData) {
        stackArray[++top] = pushData;

    }

    public int pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

}

class MyStack {

    public static void main(String args[]) {
        Stack1 ob = new Stack1(5);
        ob.push(10);
        ob.push(20);
        ob.push(30);
        while (!ob.isEmpty()) {
            int value = ob.pop();
            System.out.println(value);
        }

    }
}
