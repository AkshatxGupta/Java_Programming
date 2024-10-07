import java.util.Scanner;

public class Sumandproduct {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int product = a*b;
        System.out.println(sum);
        System.out.println(product);

        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println(area);

        sc.close();
    }
}