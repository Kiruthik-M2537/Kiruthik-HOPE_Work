import java.util.*;
public class ValidMountain {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        if (A.length < 3) {
            System.out.println("Valid Mountain Array: false");
            return;
        }

        int start = 0;
        int end = A.length - 1;

        while (start < end) {
            if (A[start + 1] > A[start]) {
                start++;
            } else if (A[end - 1] > A[end]) {
                end--;
            } else {
                break;
            }
        }

        boolean isMountain = (start != 0 && end != A.length - 1 && start == end);
        System.out.println("Valid Mountain Array: " + isMountain);

        sc.close();
    }
}