package Arrays;

public class PairsInArray {
    public  static void printPairs(int nums[]) {
        int tsp = 0;
        for(int i = 0; i < nums.length; i++) {
            int currentI = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                int currentJ = nums[j];
                System.out.print("(" + currentI + " , "+ currentJ +")");
                tsp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+tsp);
    }

    public static void main(String[] args) {
        int nums[] = {2 , 4 , 6 , 8 , 10};
        printPairs(nums);
    }
}
