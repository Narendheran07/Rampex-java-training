package DAY_8.Class_task;

import java.util.Arrays;

public class Array_reverseinplace {
    public static void main(String[] args) {

        int[] num = {10, 9, 8, 7};
        int temp;
        int n = num.length;

        for (int i = 0; i < n / 2; i++) {
            temp = num[i];
            num[i] = num[n - 1 - i];
            num[n - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(num));
    }
}