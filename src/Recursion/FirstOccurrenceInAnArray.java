package Recursion;

public class FirstOccurrenceInAnArray {

    public static int firstOcc(int[] arr, int key, int i){
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i + 1);
    }


    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9};
        int key = 3;

        int res = firstOcc(arr, key, 0);
        System.out.println(res);
    }
}
