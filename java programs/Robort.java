import java.util.Scanner;

public class Robort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        /*
         * if (button == 1) {
         * System.out.println("juice");
         * } else if (button == 2) {
         * System.out.println("milk shake");
         * } else if (button == 3) {
         * System.out.println("banana shake");
         * } else {
         * System.out.println("not available");
         * }
         */
        // ab switch statement ka use kar k code likhtein hain.
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("salam");
                break;
            case 3:
                System.out.println("Bonjour");// bonjour hello in frinch
                break;
            default:
                System.out.println("lanat ho");
                /*
                 * if else statements jab zadah hote hain tou switch statement ka use karte
                 * hain kiun ki switch ka mai code asan or kam hota hain
                 */

        }
    }

}
