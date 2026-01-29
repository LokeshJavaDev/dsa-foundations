package Arrays;

public class MissingNumber {
    public static int findMissing(int[] nums) {
        int n = nums.length + 1;
        int exceptedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum = actualSum + num;
        }
        return exceptedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5};
        int res = findMissing(nums);
        System.out.println(res);
    }
}
