package DAy_17.Class_task;

import java.util.HashSet;
import java.util.Arrays;

public class hashsetexample {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // Create HashSet
        HashSet<Integer> n = new HashSet<>();

        // Add array elements to HashSet
        for (int i : arr) {
            n.add(i);
        }

        // Convert HashSet to array
        int[] num = new int[n.size()];
        int index = 0;

        for (int i : n) {
            num[index++] = i;
        }

        System.out.println("HashSet: " + n);
        System.out.println("Array after removing duplicates: "
                + Arrays.toString(num));
    }
}