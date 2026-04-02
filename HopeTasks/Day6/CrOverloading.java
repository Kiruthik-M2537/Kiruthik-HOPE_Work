package Day6;
public class CrOverloading{
    public static void main(String[] args){
        System.out.println("Constructor overloading examples");
        COverloading c1=new COverloading(5);
        COverloading c2=new COverloading("HOPE BATCH 1");
    }
}class COverloading{
    COverloading(){
        System.out.println("Default constructor");
        CrOverloading cr=new CrOverloading();

    }
    COverloading(int i){
        System.out.println("Parameterized constructor and overloading and the value of a : "+i);
    }
    COverloading(String i){
        System.out.println("Parameterized constructor and overloading and the value of b : "+i);
    }
}
