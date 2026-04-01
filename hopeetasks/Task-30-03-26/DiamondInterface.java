import java. util.*;
    public class DiamondInterface{
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
interface A {
    default void show() {
        System.out.println("A's show() method");
    }
}
interface B {
    default void show() {
        System.out.println("B's show() method");
    }
}
class C implements A, B {
    public void show() {
        System.out.println("Resolving conflict in class C");   
        A.super.show();
        B.super.show();
    }
}
