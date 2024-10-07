import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int marks[] = new int[100] ;
        Scanner sc = new Scanner (System.in);
        // int phy;
        // phy = sc.nextInt();

        System.out.println("Length of array = " + marks.length);

        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//che
        marks[2] = sc.nextInt();//math

        System.out.println("marks of physics = " + marks[0]);
        System.out.println("marks of chemistry = " + marks[1]);
        System.out.println("marks of maths = " + marks[2]);

        sc.close();
    }
}
 