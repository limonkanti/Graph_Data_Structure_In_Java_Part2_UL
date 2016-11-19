package ExceptionHan;

class TestFinallyBlock1 {

    public static void main(String args[]) {
        try {
            int data = 25 / 0;
            System.out.println(data);
            
        } catch (Exception e) {
            
            System.out.println(e);
            System.exit(0);
        } 
        
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
