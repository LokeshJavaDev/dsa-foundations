package Arrays;

public class Main1 {
    public static int search(int arr[], int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int target = 20;

        int res = search(arr, target);
        if(res != -1){
            System.out.println("Found at:" +res);

        }else{
            System.out.println("Not found");
        }
    }
}
