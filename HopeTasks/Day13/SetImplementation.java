package Day13;
import java.util.*;
public class SetImplementation {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();
        Integer a=1;
        set.add(a);
        System.out.println(set);
        set.add(2);
        System.out.println(set);
        System.out.println(a.hashCode());
        System.out.println(set.contains(a));
        Set<String> set2=new HashSet<>();
        set2.add("KSP");
        System.out.println(set2);
        set2.add("RampeX");
        System.out.println(set2);
        set2.add("Alan");
        set2.add("Akshaya");
        set2.add("Edlym");
        
        System.out.println(set2);
        for(String str:set2){
            System.out.println(str);
        }     
    }
    
}