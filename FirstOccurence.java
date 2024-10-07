public class FirstOccurence {
    public static int First_Occurence(int arr[], int key , int i){
        if(i==arr.length) {
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return First_Occurence(arr, key , i+1);
    }
    public static int Lastoccurence(int arr[], int key , int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return Lastoccurence(arr, key, i-1);
    }
    public static int lastoccurence(int arr[],int key , int i) {
        if(i==arr.length) {
            return -1;
        }
        int isfound = lastoccurence(arr, key, i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(First_Occurence(arr, 9, 5));
        System.out.println(Lastoccurence(arr, 6, arr.length-1));
        System.out.println(lastoccurence(arr, 5, 0));
    }
}
