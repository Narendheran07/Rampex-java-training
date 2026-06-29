package DAY_7.Class_task.array;
import java.util.Scanner;
import java.util.Arrays;
public class sumofarray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number: "+i);
            arr[i]=sum + i;
            int Sum=arr[i];
            System.out.println( Sum);

            System.out.println(Arrays.toString(arr));
        }
    }
}