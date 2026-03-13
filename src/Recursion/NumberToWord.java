package Recursion;

public class NumberToWord {
    static String[] digits = {
            "zero","one","two","three","four",
            "five","six","seven","eight","nine"
    };
    public static void printWords(int n) {
        if(n == 0) {
            return;
        }

        int lastDigit = n % 10;
        int remainingDigits = n / 10;

        printWords(remainingDigits);

        System.out.print(digits[lastDigit] +" ");
    }

    public static void main(String[] args) {
        int n = 1947;
        printWords(n);
    }
}
