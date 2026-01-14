abstract class Bank {

    // abstract method
    abstract void getInterestRate();

    // normal method
    void bankInfo() {
        System.out.println("Bank provides financial services");
    }
}

class SBI extends Bank {

    void getInterestRate() {
        System.out.println("SBI interest rate is 6.5%");
    }
}

class HDFC extends Bank {

    void getInterestRate() {
        System.out.println("HDFC interest rate is 7%");
    }
}

public class Bank1 {
    public static void main(String[] args) {

        Bank b = new SBI();  // parent reference

//        b = new SBI();
        b.bankInfo();
        b.getInterestRate();

//        b = new HDFC();
        Bank c = new HDFC();
        c.bankInfo();
        c.getInterestRate();
    }
}
