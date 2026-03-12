package Recursion;

public class FriendsPairingProblem {
    public static int friendsPairing(int n) {

        // Base Case
        if(n == 1 || n == 2) {
            return n;
        }

        // single
        int single = friendsPairing(n - 1);

        // pair
        int pair = (n - 1) * friendsPairing(n - 2);

        return single + pair;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendsPairing(n));
    }
}
