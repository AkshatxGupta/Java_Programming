import java.util.Scanner;

public class even_odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        //ternary operator
        String Type = (num%2==0) ? "even" : "odd";
        System.out.println(Type);

        sc.close();
    }
}
