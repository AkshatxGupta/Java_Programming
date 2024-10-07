public class FriendsPair {
    public static int FriendsPairing(int n) {
        if(n==1||n==2) {
            return n;
        }
        //choice
        //single
        int fnm1 = FriendsPairing(n-1);
        //pair
        int fnm2 = FriendsPairing(n-2);
        int pairways = (n-1) *fnm2;
        //totways
        int totways = fnm1 + pairways;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(FriendsPairing(5));
    }
}
