package Day14;
import java.util.*;
public class FrequencyImplementation {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String s = "aabbbcc";
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }
}

