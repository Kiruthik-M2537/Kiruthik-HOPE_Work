package Day8;
import java.util.*;
public class Encapsulation {
    int a;
    Encapsulation(int a){
        this.a=a;
    }
    void display(){
        System.out.println("Implementation of Encapsulation"+a);
    }
    void setA(int a){
        this.a=a;
    }
    void getA(){
        System.out.println("Value of a is "+a);
    }
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation(10);
        obj.display();
        obj.setA(20);
        obj.getA();
    }
}
