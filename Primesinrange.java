import java.util.*;

public class Primesinrange {
    public static boolean isprime(int num) {
        if(num<=1){
            return false;
        }
        else{
            for(int i=2; i<=(num/2); i++){
                if(num%i==0) {
                    return false;
                }
            }
        return true;
        }
    }

    public static void primerange() {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter only positive number");
                int a =sc.nextInt();
                int num = 0 ;
                for(num =2 ; num<a ; num++) {
                    if(isprime(num)){
                        System.out.print(num +",");
                    }
                }sc.close();
            }
        }

    public static void main(String args[]) {
        primerange();
    }
}

