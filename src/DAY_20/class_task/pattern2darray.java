package DAY_20.class_task;

public class pattern2darray {


        public static void main(String[] args){
            int[][] arr = new int[3][4];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    int num = arr[i][j];
                    System.out.print(num);

                }
                System.out.println();
            }
        }

}
