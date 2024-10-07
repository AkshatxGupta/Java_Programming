public class Roottoleafpath {
    public static void printPath(ArrayList<Integer> path) {
        for(int i =0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("N");
    }
    public static void printRoot2Leaf (Node root , ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null ) {
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
}
