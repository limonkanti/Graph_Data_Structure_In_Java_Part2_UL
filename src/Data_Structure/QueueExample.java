package Data_Structure;

public class QueueExample {

    private int maxsize;
    private int stackArray[];
    private int top;
    private int front, rear;

    QueueExample(int size) {
        maxsize = size;
        stackArray = new int[maxsize];
        top = -1;
        front = -1;
        rear = -1;

    }

    public void push(int pushData) {
        stackArray[++front] = pushData;

    }

    public Integer pool() {
        if (front > rear) {
            return stackArray[++rear];
        }
        return null;

    }

}

class MyQueue {

    public static void main(String args[]) {
        QueueExample ob = new QueueExample(5);
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.push(40);
        System.out.println(ob.pool());
       // ob.push(50);
        System.out.println(ob.pool());
        //System.out.println(ob.pool());
        //System.out.println(ob.pool());
        //System.out.println(ob.pool());

    }
}
