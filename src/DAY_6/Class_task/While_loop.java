package DAY_6.Class_task;
import java.util.Scanner;

public class While_loop {

        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int pass =1234;
            int userPass =0;
            while (pass!=userPass){
                System.out.println("please enter your pin : " );
                userPass =sc.nextInt();
            }
            System.out.print("welcome");
        }
    }

