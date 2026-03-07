package Recursion;

public class PrintNumbersInDecOrder {
    public static void printDec(int n) {
        if(n == 0){                  // Base Condition
            return;
        }
        System.out.print(n + " ");

        //Work
        printDec(n - 1);
    }


    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}
