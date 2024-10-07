public class Optimizedpowe {
    public static int optimized_power(int a , int n) {
        if(n==0){
            return 1;
        }
        int halfPower = optimized_power(a, n/2);
        int halfPowersq = halfPower*halfPower;
        // n is odd
        if(n%2!=0){
            halfPowersq=halfPowersq*a;
        }
        return halfPowersq;
    }
    public static void main(String[] args) {
        System.out.println(optimized_power(2, 10));
    }
}
