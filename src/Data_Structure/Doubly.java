
package Data_Structure;


class Doubly {

   private int data;
    public Doubly next;
    public Doubly previous;

   public Doubly(int data) {
        
        this.previous = null;
        this.data = data;
        this.next = null;

    }

    public Doubly(Doubly previous, int data, Doubly next) {
        
        this.previous = null;
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

}