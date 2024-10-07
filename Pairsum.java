import java.util.ArrayList;

public class Pairsum {
    //brute force
    // public static boolean Pair_sum1(ArrayList<Integer> list, int target) {
    //     for( int i =0; i<list.size();i++) {
    //         for( int j =0; j<list.size();j++) {
    //             if(list.get(i)+list.get(j)==target) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    //2 pointer approach 
    public static boolean Pair_sum1(ArrayList<Integer> list, int target) {
        int lp =0;
        int rp =list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target) {
                return true;
            }
            if(list.get(lp)+list.get(rp)<target) {
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static boolean Pair_sum2(ArrayList<Integer> list, int target) {
        int bp=-1;
        int n= list.size();
        for( int i =0; i<list.size();i++) {
            if(list.get(i)>list.get(i+1)) {//breakpoint
                bp=i;
                break;
             }
            
        }
        int lp =bp+1;//smallest
        int rp=bp;//largest

        while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target) {
                return true;
            }
            //case2
            if(list.get(lp)+list.get(rp)<target) {
                lp=(lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        System.out.println(Pair_sum1(list, 5));
        System.out.println(Pair_sum2(list2, 16));
    }
}
