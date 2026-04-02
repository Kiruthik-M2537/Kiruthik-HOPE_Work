package Day7;
public class SimpleInheritance{
 public static void main(String[] args){
    System.out.println("Inside the Main function");
    Child c=new Child();
    c.display();

 }
}
class Parent{
 void display(){
    System.out.println("I am inside parent class but called by child class");
 }

}
class Child extends Parent{
    void display1(){
        System.out.println("I am inside Child class");

    }

}