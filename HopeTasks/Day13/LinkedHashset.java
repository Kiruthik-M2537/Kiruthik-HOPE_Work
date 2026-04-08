package Day13;
import java.util.*;
public class LinkedHashset {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("KSP");
        System.out.println(set);
        set.add("RampeX");
        System.out.println(set);
        set.add("Alan");
        set.add("Akshaya");
        set.add("Edlym");
        
        System.out.println(set);
        for(String str:set){
            System.out.println(str);
        }
    }
    
}