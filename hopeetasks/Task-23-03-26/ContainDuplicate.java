import java.util.*;
public class ContainDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;
        for (int num : nums) {
            if (set.contains(num)) {
                hasDuplicate = true;
                break;
            }
            set.add(num);
        }
        if (hasDuplicate) {
            System.out.println("Contains Duplicate: true");
        } else {
            System.out.println("Contains Duplicate: false");
        }

        sc.close();
    }
}