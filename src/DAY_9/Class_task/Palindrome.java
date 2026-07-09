package DAY_9.Class_task;
import java.util.Scanner;

public class Palindrome {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string : ");
            String org = sc.nextLine();
            String rev = "";

            for (int i = org.length() - 1; i >= 0; --i) {
                rev = rev + org.charAt(i);
            }

            System.out.println(rev);
            if (rev.equalsIgnoreCase(org)) {
                System.out.println("It is palindrome");
            } else {
                System.out.println("it is not palindrome");
            }

        }
    }

