package BasicJavaLearning;

public class ReverseAnInteger {
    public static int reverse(int n) {
        int rev = 0;

        while(n != 0) {
            int digit = n % 10;
            n = n / 10;
            rev = (rev * 10) + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-321));
    }
}
