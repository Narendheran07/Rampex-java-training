package DAY_9.Class_task;
import java.util.Arrays;
import java.util.Scanner;

public class Prallelarray {
    public static void main(String[] args) {
        String[] name = {"maza", "campa", "sprite", "slice", "fanta"};
        int[] price = {40, 30, 40, 30, 50};
        int[] stock = {5, 5, 5, 5, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("maza,campa,sprite,slice,fanta");
        System.out.print("Enter your order: ");
        String order = sc.nextLine();
        System.out.print("Enter your quanitity: ");
        int qty = sc.nextInt();

            for (int i = 0; i <= name.length; i++) {
                if (order.equals(name[i])) {

                    System.out.println("Bill: " + (price[i] * qty));
                }
            }


        }
    }




