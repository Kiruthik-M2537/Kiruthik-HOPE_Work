package Day7;
public class Inheritance {
    public static void main (String[] args){
dog sound=new dog();
sound.bark();
System.out.println(sound.hashCode());

    }
}
class animal{
    void display(){
        System.out.print("There are multiple animals...choose one and mention it's sound");
    }
}
class dog{
    void bark(){
        System.out .println("Dog barks");
    }
}
