import java.util.*;

public class fibonacci { //iterative method
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in) ;
    // int num = sc.nextInt();
    // int f=0,i=2;
    // int a =0;
    // int b =1;
    // if (num<2){
    //     System.out.println("Enter value greater than 2");
    // }
    // else{
    //     while(i<=num) {
    //         f = a+b;
    //         a = b;
    //         b = f;
    //         i++;
    //     }
    //     System.out.println(f);

    //     sc.close();

    //     }
    // }

    public static int fib(int num) {
        if (num<=1){
            return num;
        }
        else{
            return fib(num-1)+fib(num-2);
        }
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in) ;
        int num = sc.nextInt();
        System.out.println(fib(num));

        sc.close();
    }
    
}