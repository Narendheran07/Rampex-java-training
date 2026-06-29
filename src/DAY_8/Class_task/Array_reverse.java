package DAY_8.Class_task;
import java.util.Arrays;

public class Array_reverse {
    public static void main(String[] args) {
        String[] items = {"veg", "non_veg", "sweet", "ice cream"};
        String[] newitem = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            newitem[i] = items[items.length-1-i];


        }
        System.out.println(Arrays.toString(newitem));
    }
}