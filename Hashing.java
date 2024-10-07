import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm = new HashMap<>();
        //Insert-O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);
        //size
        System.out.println(hm);
        //Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());

        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);
        //iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String k:keys) {
            System.out.println("key="+k+",value="+hm.get(k));
        }
        LinkedHashmap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        System.out.println(lhm);

        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        System.out.println(lhm);
    }
}
