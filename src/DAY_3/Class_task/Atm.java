package DAY_3.Class_task;
import java.util.Scanner;


public class Atm {


        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Is card inserted? (1=Yes, 0=No): ");
            if (sc.nextInt() == 1)
            {
                System.out.print("Is card valid? (1=Yes, 0=No): ");
                if (sc.nextInt() == 1)
                {
                    System.out.print("Enter password: ");
                    if (sc.nextInt() == 1234)
                    {
                        System.out.print("Enter amount: ");
                        if (sc.nextInt() <= 1000)
                        {
                            System.out.println("amount disbursed");
                        }
                        else
                        {
                            System.out.println("insufficient balance");
                        }

                    }
                    else
                    {
                        System.out.println("password incorrect");
                    }
                }
                else
                {
                    System.out.println("card is invalid");
                }

            }
            else
            {
                System.out.println("card is not inserted");
            }
        }
    }

