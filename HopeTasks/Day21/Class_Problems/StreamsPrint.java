 
import java.util.*;
import java.util.stream.Collectors;
public class StreamsPrint {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // int sum=list.stream().filter(i->i%2==1).map(i->i*i).reduce(0,Integer::sum);
        // System.out.println(sum); 
        list=list.stream().filter(i->i%2==1).map(i->i*i).collect(Collectors.toList());
    }
}
