package BitManipulation;

public class ClearIthBit {
    public static int clearBit(int n, int i) {
        int BitMask = ~(1 << i);
        return n & BitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearBit(10,1));
    }
}
