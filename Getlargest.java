public class Getlargest {
    public static int Get_largest( int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0 ; i<numbers.length; i++){
            if(numbers[i]>largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,6,3,8,5};
        int num = Get_largest(numbers);
        System.out.println("Largest value is :" + num);
    }
}
