package Day12;
import java.util.*;
public class ArrayImplementation {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(null);
        arrList.add(10);
        arrList.add(20);
        System.out.println(arrList);
        arrList.set(0, 5);
        System.out.println(arrList);
        arrList.add(0,0);
        System.out.println(arrList);
        System.out.println(arrList.get(1));
        System.out.println(arrList.contains(10));
        arrList.remove(2);
        System.out.println(arrList);
        System.out.println(arrList.contains(10));
        System.out.println(arrList.size());
        arrList.add(0);
        System.out.println(arrList.indexOf(0));
        System.out.println(arrList.lastIndexOf(0));
        System.out.println(arrList.isEmpty());
        arrList.clear();
        System.out.println(arrList);
        System.out.println(arrList.isEmpty());
    }
}