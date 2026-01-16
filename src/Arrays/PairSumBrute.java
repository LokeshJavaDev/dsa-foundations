package Arrays;

public class PairSumBrute {
    public static void pair(int arr[], int target) {
        int n = arr.length;

        for(int i = 0; i< n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("Pair found: "+ arr[i]+" , "+ arr[j]);
                    return;
                }
            }
        }
        System.out.println("Not found");
    }


    public static void main(String[] args) {
        int arr[] = {10, 20,30,40,50};
        int target = 30;
        pair(arr,target);
    }
}
