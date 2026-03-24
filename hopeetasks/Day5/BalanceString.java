package Day5;
import java.util.Scanner;

public class BalanceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int balance = 0, count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }

        System.out.println("Balanced substrings count: " + count);

        sc.close();
    }
}