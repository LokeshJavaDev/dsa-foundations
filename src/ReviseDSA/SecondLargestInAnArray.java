package ReviseDSA;

public class SecondLargestInAnArray {

    public static int find(int[] nums) {
        int largest = -1;
        int secondLargest = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};
        int res = find(nums);
        System.out.println("Second Largest element in an Array is: "+res);
    }
}
