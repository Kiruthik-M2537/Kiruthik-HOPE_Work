package Day14;
import java.util.*;
public class HashmapImplementation {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Hello", null);
        System.out.println(map.get("Hello"));
        map.put("Hello", 1);
        System.out.println(map.get("Hello"));
        System.out.println(map.getOrDefault("KSP", 0));
        map.put("KSP", 2);
        System.out.println(map.get("KSP"));
    }
}