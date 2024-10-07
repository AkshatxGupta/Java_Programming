public class TilingProblem {
    public static int Tiling_Problem(int n) {
        // base case
        if(n==0||n==1) {
            return 1;
        }
        //vertical choice
        int fnm1 = Tiling_Problem(n-1);
        //horizontal choice
        int fnm2=Tiling_Problem(n-2);
         
        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(Tiling_Problem(6));
    }
}
