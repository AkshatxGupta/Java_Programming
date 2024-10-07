public class Bitmanipulation {
    public static void oddOrEven(int n) {
        int bitMask =1;
        if((n&bitMask)==0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
    public static int getIthbit(int n, int i)  {
        int bitMask =1<<i;
        if((n&bitMask)==0) {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void setithbit(int n,int i) {
        int bitMask = 1<<i;
        System.out.println( n|bitMask) ;
    }
    public static int clearithbit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthbit(int n , int i, int newBit) {
        // if(newBit == 0) {
        //     return clearithbit(n,i);
        // }
        // else {
        //     return setithbit(n, i);
        // }

        n = clearithbit(n,i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }
    public static void main(String[] args) {
        oddOrEven(38);
        oddOrEven(11);
        oddOrEven(14);
        System.out.println(getIthbit(10, 2));
        setithbit(9,3);
        System.out.println(clearithbit(10, 3));
    }
}
