package Arrays;

public class SearchUsingBinarySearch {

    public static int binarySearch(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40 , 50, 60, 70};
        int target = 70;
        int res = binarySearch(nums, target);

        if(res != -1) {
            System.out.println("Element found at index : " +res);
        }else {
            System.out.println("Not found");
        }
    }
}
