import java.util.*;
public class ShuffleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int n = sc.nextInt();

        int[] result = new int[size];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        System.out.println("Shuffled array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
} 