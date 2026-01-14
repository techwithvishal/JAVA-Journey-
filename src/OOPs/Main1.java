// // inheritence ka question code practice
//
//package OOPs;
//
//// Parent class
//class Employee {
//    void salary() {
//        System.out.println("Employee salary");
//    }
//}
//
//// Child class
//class Manager extends Employee {
//    void bonus() {
//        System.out.println("Manager bonus");
//    }
//}
//
//// Main class
//public class Main {
//    public static void main(String[] args) {
//        Manager m = new Manager();
//        m.salary(); // inherited method
//        m.bonus();  // own method
//    }
//}


//Abstraction code interview level

abstract class Vehicle {

    // abstract method
   public abstract void start();

    // normal method
    public void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle {

    // abstract method implementation
   public void start() {
        System.out.println("Car starts with key");
    }
}

public class Main1 {
    public static void main(String[] args) {

        Vehicle v = new Car();  // parent reference, child object
        v.start();
        v.fuelType();
    }
}
