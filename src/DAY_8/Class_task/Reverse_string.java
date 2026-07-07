package DAY_8.Class_task;

public class Reverse_string {

        public static void main(String[] args) {
            String name = "anu";
            String rev = "";
            int len = name.length();

            for(int i = len - 1; i >= 0; --i) {
                rev = rev + name.charAt(i);
            }

            System.out.println(rev);
        }
    }

