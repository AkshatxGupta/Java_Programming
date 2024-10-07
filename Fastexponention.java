public class Fastexponention {
    public static void Fast_exponention( int a , int n ) {
        int ans = 1;

        while (n>0) {
            if((n&1) != 0) {//check LSB
                ans *= a;
            }
            a = a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Fast_exponention(9, 5);
    }
}
