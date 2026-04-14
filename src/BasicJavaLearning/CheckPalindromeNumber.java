package BasicJavaLearning;

public class CheckPalindromeNumber {
    public static boolean isPalindrome(int n) {
        int originalNumber = n;
        int reversedNumber = 0;

        if(n < 0){
            return false;
        }

        while( n != 0){
            int digit = n % 10;
            n = n / 10;
            reversedNumber = (reversedNumber * 10) + digit;
        }
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int n = 121;
        int n1 = -121;

        System.out.println(isPalindrome(n));
        System.out.println(isPalindrome(n1));
    }
}
