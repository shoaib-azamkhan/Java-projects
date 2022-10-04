//POLYMORPHISM:
/*There are two types of polymorphism
 * Method Overloading and Overriding.
 * {
 * in Method overloading 1- same name 2-same class and
 * 3-different arguments like (no of args, seq of arg, type of args) in mai say 
 * kuch bhi different hain tou chalega.
 * }
 * 
 */

public class Polymorphism {
    void show(int a) {
        System.out.println("int method");
    }

    void show(String a) {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        Polymorphism i = new Polymorphism();
        // i.show("shoaib");is main string method print hoga.
        i.show(1);
    }

}
