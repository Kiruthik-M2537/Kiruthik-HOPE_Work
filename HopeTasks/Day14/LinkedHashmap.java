package Day14;
import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(3,"Three");
        map.put(1,"One");
        map.put(2,"Two");
        System.out.println(map);
    }
        
}