package Recursion;

public class SumNaturalNumbers {

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }

        int prevSum = sum(n - 1);
        int currentSum = n + prevSum;
        return currentSum;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}
