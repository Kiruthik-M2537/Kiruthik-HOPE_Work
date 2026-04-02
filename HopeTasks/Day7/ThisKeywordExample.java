package Day7;
class Student{
    String name;
    String rollno;
    Student(String name,String rollno){
        this.name=name;
        this.rollno=rollno;

    }
    void display(){
        System.out.println("Name: "+name+"\n"+"RollNo: "+rollno);
    }
}
public class ThisKeywordExample{
    public static void main(String[] args){
        Student s1=new Student("MEENA ","312324104170");
        s1.display();
        System.out.println(s1.hashCode());

        Student s2=new Student("KARTHIKA ","312324104144");
        s2.display();
        System.out.println(s2.hashCode());
        Student s3=new Student("MITHUNA ","312324104167");
        s3.display();
        System.out.println(s3.hashCode());



    }
}