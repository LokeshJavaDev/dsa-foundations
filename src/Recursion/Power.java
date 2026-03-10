package Recursion;

public class Power {

    public static int power(int x, int n) {

        if(n == 0){
            return 1;
        }

        int smallAns = power(x, n - 1);

        return x * smallAns;
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 5;

        int result = power(x, n);
        System.out.println(result);
    }
}