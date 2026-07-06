package DAY_3.Class_task;
import java.util.Scanner;
public class If_else2 {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number:");
            int a=scanner.nextInt();

            if(a>10){
                System.out.println("greater than 10");
            }
            else if(a<10){
                System.out.println("lesser than 10");
            }
            else{
                System.out.println("equal to 10");
            }
            scanner.close();
        }
    }

