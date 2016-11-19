package Data_Structure;

public class QueuePractise {

    private int stackarray[];
    private int maxsize;
    private int front, rear;

    QueuePractise(int size) {
        maxsize = size;
        stackarray = new int[maxsize];

        front = -1;
        rear = -1;

    }

    public void push(int pushdate) {
        stackarray[++front] = pushdate;
    }

    public Integer pool() {
        if (front > rear) {
            return stackarray[++rear];
        }
        return null;
    }

}

class M {

    public static void main(String[] args) {

        QueuePractise ob = new QueuePractise(5);
        ob.push(10);
        ob.push(20);
        System.out.println(ob.pool());

    }
}
