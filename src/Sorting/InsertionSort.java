package Sorting;

public class InsertionSort {
    public static void insertionSort(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++){
            int current = nums[i];
            int prev = i - 1;
             while (prev >= 0 && nums[prev] > current){
                 nums[prev+1] = nums[prev];
                 prev--;
             }
             nums[prev+1]=current;
        }

    }


    public static void main(String[] args) {
        int[] nums = {5,4,1,3,2};
        insertionSort(nums);
        for(int num : nums) {
            System.out.print(num +" ");
        }
    }
}
