package Day12;
import java.util.*;
public class LinkedListImplementation {
    public static void main(String[] args) {
        List<String> RunningRace = new LinkedList<>();
        RunningRace.add("A");
        RunningRace.add("B");
        RunningRace.add("C");
        RunningRace.addFirst("Start Race");
        System.out.println(RunningRace);
        RunningRace.remove("B");
        System.out.println("B is disqualified due to early start");
        System.out.println(RunningRace);
        RunningRace.addLast("Race Completed");
        System.out.println(RunningRace);
        System.out.println("A won in 0.001ms");
    }
}