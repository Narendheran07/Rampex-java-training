package DAY_20.class_task;
import java.util.stream.Stream;

public class Streamalterative {

        public static void main(String[] args){
            Stream.iterate(0,n -> n+2).limit(10).forEach(n->System.out.println(n));
            //infinite stream to stop limit using limit
        }
    }

