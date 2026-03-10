package Recursion;

public class OptimizedPower {
    public static int fatsPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        // Calculate Half Power
        int halfPower = fatsPower(x, n/2);
        int halfPowerSquare = halfPower * halfPower;

        if(n % 2 == 0) {
            halfPowerSquare = x * halfPowerSquare;
        }

        return halfPowerSquare;
    }


    public static void main(String[] args) {
        int x = 2;
        int n = 10;

        System.out.println(fatsPower(x, n));
    }
}
