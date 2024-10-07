import java.util.Scanner;

public class Strings {
    public static void printLetters(String name) {
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        char arr[] = {'a','b','c','d'};
        String str ="abcd";
        String str2 = new String("xyz");
        //strings are immutable
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str2);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        printLetters("Akshat Gupta");
        String substr ="";
        for(int i=1; i<name.length(); i++){
            substr+=name.charAt(i);
        }
        System.out.println(name.substring(0,5));
        System.out.println(substr);
        String fruits[] = {"apple" , "mango" , "banana"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out .println(largest);

        sc.close();
    }
}
