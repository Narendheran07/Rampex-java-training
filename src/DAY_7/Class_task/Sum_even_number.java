package DAY_7.Class_task;

public class Sum_even_number {

        public static void main(String[] args){
            int arr[] ={2,4,6,8,10};
            int sum=0;
            for (int i=0;i<=4;i++){
                if (i%2!=0){
                    sum = arr[i] + sum;
                }
            }
            System.out.println("sum:"+sum);
        }
    }

