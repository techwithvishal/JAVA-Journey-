 // inheritence ka question code practice 

package OOPs;

// Parent class
class Employee {
    void salary() {
        System.out.println("Employee salary");
    }
}

// Child class
class Manager extends Employee {
    void bonus() {
        System.out.println("Manager bonus");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.salary(); // inherited method
        m.bonus();  // own method
    }
}
