package DAy_17.Home_task;
import java.util.*;
import java.util.ArrayList;

public class Name_Asec_dece {

        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the size:");
            int size = sc.nextInt();
            sc.nextLine();


            ArrayList<String> n = new ArrayList<>();
            for(int i=0;i<size;i++){
                System.out.println("Enter the element:");
                n.add(sc.nextLine());
            }
            Collections.sort(n);
            System.out.println("Ascending : " + n);
            Collections.reverse(n);
            System.out.println("Descending :" + n);


        }


}
