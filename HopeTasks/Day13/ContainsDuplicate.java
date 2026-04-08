package Day13;
import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                System.out.println("Contains Duplicate");
                return;
        }
        System.out.println("No Duplicate values");
    }
}