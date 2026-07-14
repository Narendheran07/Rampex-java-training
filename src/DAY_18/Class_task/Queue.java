package DAY_18.Class_task;
import java.util.ArrayDeque;

public class Queue {

        public static void main(String[] args){
            String[] task = {"Download","complile","tet","deploy"};
            ArrayDeque<String> n = new ArrayDeque<>();
            for(String i:task){
                n.add(i);
            }
            for(String i:n){
                System.out.print( i + " -> ");
            }
        }
    }

