import java.util.*;

public class Java_function {
    
    public static void printhelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is "+ sum);

        sc.close(); //remove this statement otherwise it would show error
    }

    public static int calculate_product(int num1 , int num2 ) {
        int product = num1 * num2;
        return product;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println("value of a " + a);
        System.out.println("value of b " + b);
    }

    public static int factorial(int z) {//in case of void type
        if(z==0 || z==1){
            return 1;//System.out.println("factorial is equal to 1");
        }
        if(z>=2){
            int f = 1;
            for(int i =1 ; i<=z ; i++) {
                f*=i;
            }
            return f;//System.out.println("factorial is equal to " + f);
        }
        else{
            return -1;
        }
    }

    public static void bin_coefficient(int r, int s) {
        int fact_r = factorial(r);
        int fact_s = factorial(s);
        int fact_rms = factorial(r-s);
        
        int bin_coefficient = fact_r/(fact_s*fact_rms);
        System.out.println(bin_coefficient);
    }

    public static boolean isprime(int t) {
        if(t==2) {
            return true;
        }
        else if(t>2){
            for(int i = 2 ; i<=Math.sqrt(t); i++) {
                if (t%i==0) {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    public static void main (String args[]){
        // printhelloworld();
        // calculateSum();
        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int product = calculate_product(num1, num2);
        // System.out.print(product);
        // swap(num1, num2);
        // int y = sc.nextInt();
        // factorial(y);
        //bin_coefficient(5, 2);
        // System.out.print(isprime(127));

        //sc.close();
    }
    

}
