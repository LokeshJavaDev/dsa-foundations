package Arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    public static void moveZeros(int[] nums) {
        int n = nums.length;
        int idx = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0){
                nums[idx] = nums[i];
                idx++;
            }
        }
        // Fill the remaining positions with zero
        while(idx < n) {
            nums[idx] = 0;
            idx++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1 , 0 , 3 , 0 , 4 , 0 , 9};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
