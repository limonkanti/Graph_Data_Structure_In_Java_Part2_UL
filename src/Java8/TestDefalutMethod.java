package Java8;

public class TestDefalutMethod {

    public static void main(String args[]) {

        Vehicle v = new Car();////////////////////
        v.print();

    }
}

interface Vehicle {

    default void print() {
        System.out.println("Vehicle!!!!!");
    }
}

class Car implements Vehicle {

    public void print() {
        Vehicle.super.print();
        System.out.println("I am car");
    }

}
