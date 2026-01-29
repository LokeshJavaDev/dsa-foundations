package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return nums;
        }

        int idx = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return Arrays.copyOf(nums, idx);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4};
        int[] result = removeDuplicates(nums);

        System.out.println(Arrays.toString(result));
    }
}
