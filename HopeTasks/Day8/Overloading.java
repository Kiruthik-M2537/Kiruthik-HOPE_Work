package Day8;

public class Overloading {
    public static void main(String[] args){
        add obj=new add();
        obj.sum(5, 10);
        obj.sum(5, 10, 15);
    }
}   

class add{
    void sum(int a,int b){
        System.out.println("Sum of two numbers is "+(a+b));
    }
    void sum(int a,int b,int c){
        System.out.println("Sum of three numbers is "+(a+b+c));
    }       
}
