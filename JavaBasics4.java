import java.util.*;

public class JavaBasics4 {
    public static void main(String args[]) {
        // type conversion
        Scanner sc = new Scanner (System.in);
        float number = sc.nextInt();
        System.out.println(number);
        sc.close();
        
        // type casting
        Scanner sn = new Scanner (System.in);
        float number1 = 99.999f;
        int number2 = (int)number1 ;
        System.out.println(number2);
        sn.close();
    }
}
