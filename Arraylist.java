import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String args[]){
        //java collection framework
        //ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<String> list2 = new ArrayList<>();
        //ArrayList<Boolean> list3 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //reverse print 
        for(int i=list.size()-1; i>=0; i--) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();

        int max = Integer.MIN_VALUE;
        for(int i=list.size()-1; i>=0;i--){
            max = Math.max(max, list.get(i));
        }
        System.out.println("max element =" + max);
    
        int idx1 = 4;
        int idx2 = 2;
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list.get(idx1));
        System.out.println(list.get(idx2));

        System.out.println(list);
        Collections.sort(list);//ascending
        System.out.println(list);

        //descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> listtt = new ArrayList<>();
        listtt.add(1); listtt.add(2);
        mainList.add(listtt);

        ArrayList <Integer> listtx =new ArrayList<>();
        listtx.add(3); listtx.add(4);
        mainList.add(listtx);

        System.out.println(listtt);
        System.out.println(listtx);

        for(int i =0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for( int j=0 ; j<currList.size(); j++){
                System.out.print(currList.get(j)+ " ");
            }
        }
        System.out.println();

        for(int i=1; i<=2;i++){
            listtt.add(i*1);
            listtx.add(i*-2);
        }
        mainList.add(listtt);
        mainList.add(listtx);
        System.out.println(mainList);
        System.out.println(listtt);
        System.out.println(listtx);
    }
}
