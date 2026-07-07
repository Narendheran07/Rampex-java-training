package DAY_7.home_task;
import java.util.Scanner;

public class Hollow_Square {

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number: ");
            int n=sc.nextInt();

            for(int i=1;i<=n;i++){             //row
                for(int j=1;j<=n;j++){        //column
                    if((i==1) || i==n || j==1 || j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }

}
