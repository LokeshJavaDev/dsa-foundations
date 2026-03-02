package ReviseDSA;

public class TwoSumBrute {
    public static int[] twoSum(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1}; // If pair not found
    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] res = twoSum(arr, target);
        System.out.println(res[0] +" "+res[1]);
    }
}
