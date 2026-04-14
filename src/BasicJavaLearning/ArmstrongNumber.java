package BasicJavaLearning;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while(n != 0) {
            int digit = n % 10;
            sum = (int) (sum + Math.pow(digit, digits));
            n = n / 10;
        }
        return originalNumber == sum;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }
}
