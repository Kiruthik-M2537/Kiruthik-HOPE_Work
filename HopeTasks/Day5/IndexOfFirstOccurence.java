package Day5;
import java.util.*;
public class IndexOfFirstOccurence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string 1:");
        String s1=sc.next();
        System.out.print("Enter the string 2:");
        String s2=sc.next();
        System.out.println(s1.indexOf(s2));
    }
}