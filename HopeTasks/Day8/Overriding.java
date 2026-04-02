package Day8;
public class Overriding {
       public static void main(String[] args) {
        Animal a1=new Dog();
        Animal a2=new Cat();
        Animal a3=new Cow();
        a1.sound();
        a2.sound();
        a3.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
class Cow extends Animal{
    void sound(){
        System.out.println("Cow maaa");
    }
}

