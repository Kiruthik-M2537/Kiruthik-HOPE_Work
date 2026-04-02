package Day7;
class superExample1{
    superExample1(){
        System.out.println("Called in superExample1 by super keyword");
   
    }
    void hello(){
    System.out.println("hello from super example 1");
    }

}
class superExample2 extends superExample1{
    superExample2(){
        System.out.println("Called in superExample2");
    }
    void reject(){
        System.out.println("i didnt call u y u came in?");
        super.hello();
    }
    

}
public class SuperKeyword{
    public static void main(String[] args){
        superExample2  se=new superExample2();
        se.reject(); 

    }
}