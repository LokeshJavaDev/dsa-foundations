package Recursion;

public class LastOccurrence {
    public static int lastOcc(int[] arr, int key, int i) {
        // Base Case
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);

        // If element found later
        if(isFound != -1){
            return isFound;
        }

        // check the current element
        if(arr[i] == key) {
            return i;
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9};
        int key = 3;
        int res = lastOcc(arr, key, 0);
        System.out.println(res);
    }
}
