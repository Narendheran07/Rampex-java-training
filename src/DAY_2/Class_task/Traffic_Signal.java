package DAY_2.Class_task;

import java.util.Scanner;

public class Traffic_Signal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal: ");
        String colour = sc.nextLine();

        if (colour.equalsIgnoreCase("green")) {
            System.out.println("Go");
        }
        else if (colour.equalsIgnoreCase("yellow")) {
            System.out.println("Wait");
        }
        else if (colour.equalsIgnoreCase("red")) {
            System.out.println("Stop");
        }
        else {
            System.out.println("Invalid Signal");
        }

        sc.close();
    }
}