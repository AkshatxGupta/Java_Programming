public class Invertedhalfpyramid {
    public static void Inverted_halfpyramid(int n) {
        for(int i=1 ; i <= n ; i++ ) {
            for(int j=1 ; j <= n-i+1 ; j ++ ) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Inverted_halfpyramid(5);
    }
}
