package Day9;
import java.util.*;

public class Abstraction {
    public static void main(String[] args) {
    Animal a = new Dog();
    a.eat();
    a.sound();
    Animal b= new Cat();
    b.eat();
    b.sound();
}
}
abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
	void sound(){
	System.out.println("Barks...");
    }
}
class Cat  extends  Dog{
    void sound(){

        System.out.println("Meows...");
    }
}
