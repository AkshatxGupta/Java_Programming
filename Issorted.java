public class Issorted {
    public static boolean Is_sorted(int arr[],int i) {
        if(i==arr.length-1) {
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return Is_sorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,9,5};
        boolean bool=Is_sorted(arr,0);
        System.out.println(bool);
    }
}
