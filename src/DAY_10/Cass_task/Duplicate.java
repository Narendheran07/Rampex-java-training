package DAY_10.Cass_task;

public class Duplicate {
    public static void main(String[] args){
        String []arr={"Sam","ram","ram","priya","Sam","Sam"};
        for(int i=0;i<arr.length;i++){
           // System.out.println(arr[i]);
           for(int j=0;j<arr.length;j++){
               //System.out.println(arr[j]);

                if(arr[i]==arr[j] && i!=j && i<j){
                  System.out.println(arr[j]);
                }
            }
        }
}
}
