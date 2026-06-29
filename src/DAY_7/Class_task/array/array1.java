package DAY_7.Class_task.array;
import java.lang.reflect.Array;


import java.util.Scanner;
import java.util.Arrays;


public class array1 {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[100];
        for(int i=0;i<5;i++){
            System.out.print("Enter the  value of positin: "+(i+1));
            arr[i]= sc.nextInt();
            System.out.println(Arrays.toString(arr));
        }
    }
}
