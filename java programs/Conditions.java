
/*1- user input age
 *2- if (age>18) then adult.
  3- else No adult.  
 */
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int age = sc.nextInt();
         * if (age > 18) {
         * System.out.println("Adult");
         * } else {
         * System.out.println("Not Adult");
         * }
         */
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("a and b are equal number ");
        } else if (a > b) {
            System.out.println("a is greater value");
        } else {
            System.out.println("b is greater number");
        }

    }

}
