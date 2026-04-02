public class task1{
    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.displayA(); 
        obj.displayB();  
        obj.displayC(); 
    }
}
class ClassA {
    private int privateVar = 10;
    int defaultVar = 20;          
    protected int protectedVar = 30;
    public int publicVar = 40;
    public void displayA() {
        System.out.println("ClassA Values:");
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
    public int getPrivateVar() {
        return privateVar;
    }
}
class ClassB extends ClassA {
    public void displayB() {
        System.out.println("\nClassB Accessing ClassA:");
        System.out.println("Private (via getter): " + getPrivateVar());
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}
class ClassC extends ClassB {
    public void displayC() {
        System.out.println("\nClassC Accessing ClassA:");
        System.out.println("Private (via getter): " + getPrivateVar());
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}
