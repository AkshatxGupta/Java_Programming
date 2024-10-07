public class Reverse_arrays {
    public static void reverse(int numbers[]) {
        int first=0, last = numbers.length-1;

        while(first<last){
            int temp = numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
    }
    public static void main(String args[]){
        int numbers[] = {4,8,6,9,1,3,7};
        reverse(numbers);
    }
}
