package Arrays;

public class SearchInRotatedSortedArray {
    public static int search(int arr[], int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] ==  target){
                return mid;
            }

            // Left half is sorted
            if(arr[low] <= arr[mid]) {
                if(target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            // Right half sorted
            else {
                if(target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else{
                    high = mid - 1;
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int res  = search(arr, target);

        if(res != 1){
            System.out.println("Target found at index: " + res);
        }else{
            System.out.println("Target not found");
        }
    }
}


//Algorithm: Modified Binary Search
//Time Complexity: O(log n)
//Space Complexity: O(1)
