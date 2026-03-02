package ReviseDSA;

public class LargestInArray {
    public static int findLargest(int[] nums) {
        int max = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 7, 4};
        System.out.println("Max: "+findLargest(nums));
    }
}
