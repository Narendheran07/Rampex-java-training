public class BankingOOP {

    public static void main(String[] args) {

        SBIAccount s1 = new SBIAccount();

        s1.accname = "Narendheran";

        s1.deposit(2000);
        s1.withdrawl(1000);


        System.out.println("Current Balance : " + s1.checkbalance());
    }
}

interface RBI {

    void deposit(float amount);

    void withdrawl(float amount);

    float checkbalance();
}

class SBIAccount implements RBI {

    String accname;
    int accno;
    float balance;

    public void deposit(float amount) {
        balance = balance + amount;
        System.out.println("Deposit : " + amount);
        System.out.println("Remaining Balance : " + balance);
    }

    public void withdrawl(float amount) {
        balance = balance - amount;
        System.out.println("Withdrawal : " + amount);
        System.out.println("Remaining Balance : " + balance);
    }


    public float checkbalance() {
        return balance;
    }
}