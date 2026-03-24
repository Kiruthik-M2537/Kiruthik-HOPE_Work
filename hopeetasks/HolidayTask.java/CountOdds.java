import java.util.Scanner;

public class CountOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter low: ");
        int low = sc.nextInt();

        System.out.print("Enter high: ");
        int high = sc.nextInt();

        int result;

        if (low % 2 == 0 && high % 2 == 0) {
            result = (high - low) / 2;
        } else {
            result = (high - low) / 2 + 1;
        }

        System.out.println("Number of odd numbers: " + result);
        sc.close();
    }
}