public class printBinstrings {
    public static void print_Binstrings(int n, int lastPlace, String str) {
        //base case
        if(n==0) {
            System.out.println(str);
            return;
        }
        print_Binstrings(n-1,0, str+"0");

        if(lastPlace == 0){
            print_Binstrings(n-1, 1, str +"1");
        }
    }
    public static void main(String[] args) {
        print_Binstrings(3, 0, "");
    }
}
