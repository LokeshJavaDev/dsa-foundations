package Arrays;

public class MaxSubArraySum {
    public static int maxSubArraySum(int arr[]) {
        int current_sum = arr[0];
        int res = arr[0];
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            current_sum = Math.max(current_sum + arr[i] , arr[i]);

            res = Math.max(current_sum , res);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubArraySum(arr)); // output ---> 11
    }
}


/**
 * TC = O(n) ---> Kadane’s Algorithm ka TC
 * SC = O(1)
 **/