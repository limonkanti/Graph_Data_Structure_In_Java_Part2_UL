package Data_Structure;


public class DoublyLLTest {

    private Doubly head;
    private int size;

   public DoublyLLTest() {
        size = 0;
        head = null;

    }

    public void addFirst(int data) {
        size++;
        if (head == null) {
            head = new Doubly(null, data, null);

        } else {
            Doubly newLink = new Doubly(null, data, head);
            head.previous = newLink;
            head = newLink;
        }
        
    }

    /*public void addLast(int data) {
        if (head == null) {
            head = new Doubly(null, data, null);

        } else {
            Doubly current = head;
            while (current.next != null) {
                current = current.next;
            }
            Doubly newLink = new Doubly(current, data, null);
            current.next = newLink;
        }
        size++;

    }*/

    public void print() {
        Doubly current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }

    public static void main(String[] args) {

        DoublyLLTest ob = new DoublyLLTest();
        ob.addFirst(10);
        ob.addFirst(20);
        ob.print();
    }

}
