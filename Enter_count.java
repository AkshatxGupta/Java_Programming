import java.util.Scanner;

public class Enter_count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int count = 1;
        int sum=0;

        while(count<=range){
            System.out.println(count);
            sum = sum + count;
            count++;
        }
        System.out.println("sum is :" + sum);
        sc.close();
    }
}
