import java.util.Arrays;
import java.util.Collections;
//import java.util.*;

public class Inbuiltsort {
    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
}

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr, 0, 5 , Collections.reverseOrder());
        printArr(arr);
    }
}
