public class Recursion {
    public static void printInc(int n) {
        if(n==1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void printDec(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static int fact(int n) {
        if(n==1){
            return 1;
        }
        int f = fact(n-1);
        int factorial = n*f;

        return factorial;
    }
    public static int Calsum(int n) {
        if(n==1){
            return 1;
        }
        int s= Calsum(n-1);
        int sum = s+n;

        return sum;
    }
    public static int fib(int n) {
        if(n==0 || n==1) {
            return n;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        int fn=f1+f2;

        return fn;
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printInc(n);
        System.out.println();
        System.out.println(fact(n));
        System.out.println(Calsum(n));
        System.out.println(fib(n));
    }
}
