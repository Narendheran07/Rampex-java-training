package DAY_20.class_task;

import java.util.Arrays;
public class Streamdemo {

        public static void main(String[] args){
            int[] arr = {4,3,5,4,7,8,2,3,1};
            Arrays.stream(arr).filter((n)->n%2==0).sorted().forEach(n->System.out.println(n));
        }

}
