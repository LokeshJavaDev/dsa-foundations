package Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n-i-1; j++) {
                if(nums[j] > nums[j+1]){
                    // Swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 5, 2, 3};
        bubbleSort(nums);

        System.out.println("Sorted Array using bubble sort : ");
        for(int num :  nums) {
            System.out.println(num + " ");
        }
    }
}
