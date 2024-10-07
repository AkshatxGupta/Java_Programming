import java.util.Scanner;

public class calculatesum {
    public static int calculate_sum(int num1 , int num2) {//parameter or formal parameter
        int sum = num1+num2;
        return sum;
    }

    public static int sum (int a , int b) {
        return a+b;
    }
    public static int sum (int a, int b , int c ) {
        return a+b+c;
    }
    public static double sum (double a , float b) {
        return a+b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = calculate_sum(a, b);//argument or actual parameters
        System.out.println("sum is :"+sum);

        System.out.println(sum(a,b));
        System.out.println(sum(15.0,b));
        System.out.println(sum(a,b,c));

        sc.close();
    }
}
