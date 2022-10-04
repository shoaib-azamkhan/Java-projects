import java.util.Scanner;

public class Table {
    public static void main(String args[]) {
        // yahan hum for loop ka use karange.
        // for(initialisation; condition; updation)

        // pehle hum user input lene k liya scanner ka use karange.
        // kiun ki jo cheez user input lega use ka hi table ayega 10 tak
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i * n);

        }

    }

}
