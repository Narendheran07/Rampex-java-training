package DAY_6.Class_task;

public class Star_patter {

        public static void main(String [] args ){
            for (int i=5;i>=1;i--)
            {
                for (int j = 1; j <= i; j++) { // prints * * * * *
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

