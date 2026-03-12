package Recursion;

public class BinaryString {

    public static void printBinary(int n, int lastDigit, String str){

        if(n == 0){
            System.out.println(str);
            return;
        }

        // place 0
        printBinary(n-1, 0, str + "0");

        // place 1
        if(lastDigit == 0){
            printBinary(n-1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        int n = 3;

        printBinary(n, 0, "");
    }
}