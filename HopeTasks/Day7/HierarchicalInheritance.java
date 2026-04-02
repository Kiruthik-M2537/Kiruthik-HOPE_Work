package Day7;
public class HierarchicalInheritance{
    public static void main(String[] args){
        son s=new son();
        s.display();
        s.job();
        Daughter dt=new Daughter();
        dt.display();
        dt.business();

    }
}
class Father{
    void display(){
        System.out.println("I am the father and i ahve 1 son and 1 daughter");
    }

}
class son extends Father{
    void job(){
        System.out.println("Since you are going to job i am going to hand over the busiess to your sister");
    }
}
class Daughter extends Father{
    void business(){
        System.out.println("Since I have my own business .I dont have proper time to manage yours.Hand over the business to the brother as the job is temporary");
    }
}