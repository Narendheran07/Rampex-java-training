package DAY_8.Class_task;
import java.util.Arrays;

public class Second_Max {
    public static void main(String[] args){
        int [] arr={1,2,3,5,4};
        int max=0;
        int smax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];}
                else if(arr[i]> smax && arr[i]!=max){
                    smax=arr[i];                }
            }
        System.out.println("Second max: "+smax);

        }



    }

