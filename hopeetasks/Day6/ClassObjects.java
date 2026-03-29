package Day6;
public class ClassObjects {
    public static void main(String[] args) {
        System.out.println("I am inside Class Objects");
        Apartment apt=new Apartment();
        apt.display();
        
    }
    
}
 class Apartment{
    void display() {
        System.out.print("I an inside apartment");
    }

}


