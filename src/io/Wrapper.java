package io;

public class Wrapper {

    public class Wrapped {

        public void sayHello() {
            System.out.println("Hello, world!");
        }
        
    }
     public static void main(String[] args)
     {
         
         Wrapper.Wrapped ob=new Wrapper().new Wrapped();
            new Wrapper().new Wrapped();
            new Wrapper().new Wrapped();
            Wrapper wrapper = new Wrapper();
            Wrapper.Wrapped wrapped = wrapper.new Wrapped();
        
     }
}
