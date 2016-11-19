package Data_Structure;

public class DLinkedListTest {

    private DLink head;
    private int size;

    public DLinkedListTest() {
        head = null;
        size = 0;
    }

    public void addFront(int data) {
         size++;
        if (head == null) {
            head = new DLink(null, data, null);
        } else {
            DLink newLink = new DLink(null, data, head);
            head.previous = newLink;
            head = newLink;

        }
       

    }

 /*   public void addRear(int data) {
        if (head == null) {
            head = new DLink(null, data, null);
        } else {
            DLink current = head;
            while (current.next != null) {
                current = current.next;
            }
            DLink newLink = new DLink(current, data, null);
            current.next = newLink;
        }

        size++;

    }*/

    /*public void removeFront() {
        if (head == null) {
            return;
        }
        head = head.next;
        head.previous = null;
        size--;
    }

    public void removeRear() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        DLink current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void insertAt(int data, int index) {
        if (head == null) {
            return;
        }
        if (index < 1 || index > size) {
            return;
        }
        DLink current = head;
        int i = 1;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.previous == null) {
            DLink nextLink = new DLink(null, data, current);
            current.previous = nextLink;
            head = nextLink;

        } else {
            DLink nextLink = new DLink(current.previous, data, current);
            current.previous.next = nextLink;
            current.previous = nextLink;
        }
        size++;
    }

    public void removeAt(int index) {
        if (head == null) {
            return;
        }
        if (index < 1 || index > size) {
            return;
        }
        DLink current = head;
        int i = 1;
        while (i < index) {
            current = current.next;
            i++;
        }

        if (current.previous == null) {
            current = current.next;
            current.previous = null;
            head = current;
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
    }*/

    public void print() {
        DLink current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String args[]) {
        DLinkedListTest ob = new DLinkedListTest();

        ob.addFront(5);
        ob.addFront(20);

        //  ob.print();
        System.out.println("-------------------");

        //ob.print();
      //  ob.addRear(10);
      //ob.addRear(25);
        //     System.out.println("Print rear");
        //  ob.print();
        //System.out.println("---------------");
        //      ob.removeFront();
        //     System.out.println("Print Front");
        //      ob.print();
        //     ob.removeRear();
        //     ob.print();
//.... ob.insertAt(36, 2);
        ob.print();
       // ob.removeAt(2);
       // ob.print();

    }
}
