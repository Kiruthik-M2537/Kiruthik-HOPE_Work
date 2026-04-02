package Day10;
public class getterSetter {
    public static void main(String[] args){
    Name n=new Name();
    n.setName("MEENA");
    System.out.println(n.getName());
    }

    
}

 class Name{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
