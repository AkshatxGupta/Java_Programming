import java.util.*;

public class Hashsetoperations {
    public static void countdistinct() {
        int num[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<num.length; i++) {
            set.add(num[i]);
        }
        System.out.println("ans = "+ set.size());
    }
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);
        set.remove(2);
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }
        System.out.println(set);
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        for(String city :cities){
            System.out.print(city+" ");
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);

        countdistinct();
    }
}
