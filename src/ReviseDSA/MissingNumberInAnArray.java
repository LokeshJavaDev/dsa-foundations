package ReviseDSA;

public class MissingNumberInAnArray{

    public static int findMissing(int[] arr, int n) {
        int exceptedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for(int num: arr) {
            actualSum = actualSum + num;
        }
        return exceptedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(findMissing(arr,5));
    }
}
