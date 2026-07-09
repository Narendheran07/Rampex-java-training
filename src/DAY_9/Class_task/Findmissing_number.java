package DAY_9.Class_task;

public class Findmissing_number {
    public static void main(String[] args){
        int []arr={1,3,4,5,6,7};
        int sum=0;
        int n=6;
        int arrsum=0;
        for(int i=1;i<=n;i++){
            sum=n+(i+1);
        }
        System.out.println(sum);
    }
}
