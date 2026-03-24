package Day4;
import java.util.Scanner;

public class EvenDigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int res = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            int num = nums[i];

            // Count digits
            while (num > 0) {
                count++;
                num = num / 10;
            }

            if (count % 2 == 0) {
                res++;
            }
        }

        System.out.println("Count of even digit numbers: " + res);
        sc.close();
    }
}
