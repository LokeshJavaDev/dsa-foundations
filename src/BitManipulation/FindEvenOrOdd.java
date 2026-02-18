package BitManipulation;

public class FindEvenOrOdd {

    public static void check(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0)  {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }


    public static void main(String[] args) {
        check(5);
        check(4);
    }
}
