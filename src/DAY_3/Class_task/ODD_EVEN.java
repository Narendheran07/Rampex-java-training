package DAY_3.Class_task;
import java.util.Scanner;


public class ODD_EVEN {


        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number : ");
            int a= sc.nextInt();

            if(a%2==0){
                System.out.println("Even number");
            }
            else{
                System.out.println("Odd number");
            }
            sc.close();
        }

    public static class If_else {

            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter the number:");
                int a=scanner.nextInt();

                if(a>90){
                    System.out.println("greater than 90");
                }
                else if(a>50){
                    System.out.println("greater than 50");
                }
                else{
                    System.out.println("greater than 10");
                }
                scanner.close();
            }
        }
}

