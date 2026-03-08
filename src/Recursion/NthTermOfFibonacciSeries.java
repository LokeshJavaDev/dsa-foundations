package Recursion;

public class NthTermOfFibonacciSeries {
    public static int fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        int prevFirst = fibonacci(n - 1);
        int prevSecond = fibonacci(n - 2);
        int currentValue = prevSecond + prevFirst;
        return currentValue;
    }

    public static void main(String[] args) {
        int n = 5;
        int res = fibonacci(n);
        System.out.println(n + " term of Fibonacci series is: "+ res);
    }
}
