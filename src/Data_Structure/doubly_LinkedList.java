package Data_Structure;

class DNode {

    protected DNode next, prev;
    protected int data;

    DNode() {
        data = 0;
        next = null;
        prev = null;
    }

    DNode(int d, DNode n, DNode p) {
        data = d;
        next = n;
        prev = p;
    }

    public int getData() {
        return data;
    }

    public DNode getLinkNext() {
        return next;
    }

    public DNode getLinkPrev() {
        return prev;
    }

    public void setLinkNext(DNode n) {
        next = n;

    }

    public void setLinkPrev(DNode p) {
        prev = p;

    }
}

public class doubly_LinkedList {

    protected DNode start;
    protected DNode end;
    public int size;

    doubly_LinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public void insertAtStart(int val) {
        DNode nptr = new DNode(val, null, null);
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            start = nptr;
        }
        size++;
    }

    public void insertAtEnd(int val) {
        DNode nptr = new DNode(val, null, null);

        if (start == null) {
            start = nptr;
            end = start;
        } else {
            nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            end = nptr;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        if (size == 0) {
            System.out.println("Empty");
        } else {
            DNode link = start;
            while (link != null) {
                System.out.println(link.getData());
                link = link.getLinkNext();

            }
        }

    }
    public boolean delete()
    {
        if(start==null)
            return false;
        else
        {
            start=start.getLinkNext();
            return true;
        }
        
    }

    public static void main(String args[]) {
        doubly_LinkedList ob = new doubly_LinkedList();
        ob.insertAtStart(10);
        ob.insertAtStart(20);
        // ob.print();
        ob.insertAtEnd(100);
        ob.insertAtEnd(200);
        ob.print();
        System.out.println(ob.getSize());
        ob.delete();
        System.out.println("..........delete......");
        ob.print();
        System.out.println(ob.getSize());
    }
}
