package Day5;
import java.util.*;
public class Defanging{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the IP Address:");
        String address=sc.next();
        System.out.println(address.replace(".","[.]"));
    }
}