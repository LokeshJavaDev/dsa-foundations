package Arrays;

public class LargestInArray {
    public static int getLargest(int nums[]) {
        int largest = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length; i++) {
            if(largest < nums[i]) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int nums[] = {1 , 2 , 6 , 3 , 4 ,5};
        int res = getLargest(nums);
        System.out.println("Largest number is : "+res);
    }
}

// TC -- O(n)
//SC --- O(1)
