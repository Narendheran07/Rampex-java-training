package DAY_11.Class_task;

public class Bank {

        public static void main(String[] args){
            Bankaccount b1= new Bankaccount();
            b1.balance = 1000;
            System.out.println("Initial balance : " + b1.balance);
            b1.deposit(1500);
            b1.withdraw(200);
        }

        static class Bankaccount {


            static  final   String bankName="sbi";
            String accholdername;
            int accno;
            float balance;

            public void deposit(float amount) {
                balance = balance + amount;
                System.out.println("Amount deposited:" + amount + " Rs" + " Balance " + balance);
            }

            public void withdraw(float amount) {
                balance = balance - amount;
                System.out.println("Amount Withdrawn: " + amount + " Rs" + " Balance " + balance);
            }
        }

}
