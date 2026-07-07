package DAY_7.Class_task;
import java.util.Arrays;
import java.util.Scanner;


public class Array_example1 {




        public static void main(String[] args) {
            int[] arr = new int[10];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.println("enter the value:");
                arr[i] = sc.nextInt();
                System.out.print(Arrays.toString(arr));
            }

        }
    }

