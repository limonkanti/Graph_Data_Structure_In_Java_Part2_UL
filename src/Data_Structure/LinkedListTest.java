package Data_Structure;

public class LinkedListTest {

    private Link head;
    int size = 0;

    LinkedListTest() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(int data) {
        Link nextLink = new Link(data);
        nextLink.next = head;
        head = nextLink;
        size++;
    }
    public void insertAtEnd(int data) {
        Link nextLink = new Link(data);
        nextLink.next = head;
       head = null;
        size++;
    }
    public void insertAt(int data,int index)
    {
       if(head==null) return;
       if(index<1||index>size) return;
       Link current =head;
       int i=1;
       while(i<index)
       {
           current=current.next;
           i++;
       }
       if(current.next!=null)
       {
           Link nextLink=new Link(data);
       
           current.next=nextLink;
           head=nextLink;
           
       }
      
       size++;
    }

    public void clear() {
        // head=null;
        size = 0;

    }

    public int getSize() {
        return size;
    }

    public boolean delete() {
        if (head == null) {
            return false;
        } else {
            head = head.next;
            size--;
            return true;

        }

    }

    public void print() {
        Link current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }

    }

    public static void main(String args[]) {
        LinkedListTest ob = new LinkedListTest();
        System.out.println("--------------------ii............ ");
        ob.insert(17);
        ob.insert(22);
        ob.insert(30);
        ob.insert(40);
        ob.print();
        ob.insertAtEnd(44);
        ob.print();
        System.out.println("Size is " + ob.getSize());
        System.out.println("Empty is " + ob.isEmpty());
      //  System.out.println("Delete first head from the list "+ob.delete());
        //  System.out.println("Delete second head from the list "+ob.delete());
 // System.out.println("---d--------");
 // ob.delete();
 // System.out.println("Size is " + ob.getSize());
        // ob.delete();
 // System.out.println("---clear--------");
 /// ob.clear();
  //ob.print();
 //System.out.println("Size is " + ob.getSize());
        ob.insertAt(1, 222);
        ob.print();

    }

}
