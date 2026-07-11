package DAY_16.Class_task;
import java.util.ArrayList;

public class Collection {

        public static void main(String[] args){
            ArrayList<String> num= new ArrayList<>();
            num.add("ramya");
            num.add("pavitha");
            num.add("priya");
            num.add("nisha");
            num.add("monika");
//        for(int i=0;i<num.size();i++) {
//            System.out.println(num.get(i));
//        }
            for(String i : num){
                System.out.println(i + " " + i.length());
            }
        }
    }
