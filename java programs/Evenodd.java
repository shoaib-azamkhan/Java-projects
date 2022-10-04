
import java.util.Scanner;

/*java aik class based language hai or is mai class k bagair code nhi likhsakte.
class jis b name say banate hai us ka first latter capital hota hai oe wohi name say 
file ka name rakh k .java say save kte hain.*/
public class Evenodd {
    public static void main(String args[])
    // is tag ko boiler plate tag kehte hain or ya java mai bydefold ata hai.
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // jab bhi user input lena ho tou scanner or next ka use krte hain.

        if (x % 2 == 0) {
            System.out.println("even number");
            // syso + tap is ki shortcut hain.
        } else {
            System.out.println("odd number");

        }
    }

}
