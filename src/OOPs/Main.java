// ye main class h encapsulation waale code ki 

package OOPs;

public class Main {
    public static void  main(String[] args){
        BankAccount ac = new BankAccount();
        ac.setbalance(50000);
        System.out.println("your account balance is : " +ac.getBalance());
    }
}
