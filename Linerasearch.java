public class Linerasearch {
    public static int Linera_search(String menu[], String key) {
        for(int i=0; i<menu.length ; i++) {
            if(menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //int numbers[] ={2,4,6,8,10,12,14,16} ;
        String menu[] ={"dosa" , "chole bhature" , "samosa" , "dhokla"};
        String key = "samosa";
        int index = Linera_search(menu, key);

        if(index == -1) {
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("Key is found at index :" + index);
        }
    }
}
