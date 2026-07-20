package DAY_20.class_task;
import java.util.stream.Stream;

public class Stringbiglength {

        public static void main(String[] args){
            Stream<String> s = Stream.of("rahul","keerthi","pravin","kishore");
            System.out.println(s.map(n->n.length()).reduce(0,(a,b)->a>b?a:b));
        }
    }
}
