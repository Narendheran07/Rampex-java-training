package DAY_19.Home_task;
import java.util.ArrayList;
import java.util.Collections;

public class firstcharrepeat {

        public static void main(String[] args){
            String str = "proframming";
            ArrayList<Character> list = new ArrayList<>();
            for(int i=0;i<str.length();i++){
                list.add(str.charAt(i));
            }
            for(Character ch:list){
                if(Collections.frequency(list,ch) >1){
                    System.out.print(ch);
                    break;
                }

            }

        }

}
