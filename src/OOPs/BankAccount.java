
//  This is my encapsulation practice code 
package OOPs;

public class BankAccount {
    private int balance;

    public void setbalance(int amount){
        if(amount>0){
            balance = amount;
        }
    }

    public int getBalance(){
        return balance;
    }
}
