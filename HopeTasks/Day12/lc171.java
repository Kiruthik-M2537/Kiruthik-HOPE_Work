package Day12;
import java.util.*;

public class lc171 {
    public static int titleToNumber(String columnTitle) {
        int r=0;
        for(char ch:columnTitle.toCharArray()){
            r=r*26+(ch-'A'+1);
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(titleToNumber(s));
        sc.close();
    }
}