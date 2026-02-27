package BitManipulation;

public class UpdateIthBit {
    public static int clearBit(int n, int i) {
        int BitMask = ~(1 << i);
        return n & BitMask;
    }

    public static int UpdateIthBit(int n, int i, int newBit) {
        n = clearBit(n, i);
        int BitMask = newBit << i;

        return n | BitMask;

    }

    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10,2,1));
    }
}
