package Task-26-03-26;
import java.util.*;
class LibraryItem{
    int id;
    String title;
    String author;
    boolean isAvailable;
    void displayInfo(){
    System.out.println("ID: "+id+"\n TITLE: "+title+"\n AUTHOR: "+author+"\n AVAILABILITY: "+isAvailable);
    }
    void issueItem(){
        if(isAvailable){
            isAvailable=false;
            System.out.println("Book issued");
        }else{
            System.out.println("Book not available");
        }

    }
    void returnItem(){
        isAvailable=true;
        System.out.println("Book returned");

    }
}
class Book extends LibraryItem{
    String genre;
    int pages;


}
class Magazine extends LibraryItem{
    int issueNumber;

}
class DVD extends LibraryItem{
    int duration;

}
class User{
    int userId;
    String name;

    void borrowItem(LibraryItem item){
        item.issueItem();

    }
    void returnItem(LibraryItem item){
        item.returnItem();

    }
}
class Student extends User{

}
class Faculty extends User{
    
}
public class task1 {
    ArrayList<LibraryItem> items = new ArrayList<>();
ArrayList<User> users = new ArrayList<>();
    void addItem(LibraryItem item){
        items.add(item);

    }
    void registerUser(User user){
users.add(user);
    }
    void issueItem(User user,LibraryItem item){
user.borrowItem(item);
    }
    void returnItem(User user,LibraryItem item){
user.returnItem(item);
    }
    void displayAllItem(){
for(LibraryItem item:items){
    item.displayInfo();
}
    }
    public static void main(String[] args){
        task1 lib = new task1();
        Book b1 = new Book();
b1.id = 1;
b1.title = "Java Basics";
b1.author = "ABC";
b1.isAvailable = true;

Magazine m1 = new Magazine();
m1.id = 2;
m1.title = "Tech Monthly";
m1.author = "XYZ";
m1.isAvailable = true;
lib.addItem(b1);
lib.addItem(m1);
Student s1 = new Student();
s1.userId = 101;
s1.name = "Meena";

Faculty f1 = new Faculty();
f1.userId = 201;
f1.name = "Dr. Rao";
lib.registerUser(s1);
lib.registerUser(f1);
lib.issueItem(s1, b1);
lib.displayAllItem();
lib.returnItem(s1, b1);

    }
}