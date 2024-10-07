public class IsvalidBST {
    public static boolean isvalidBST(Node root , Node min , Node max) {
        if(root == null ) {
            return true;
        }
        if(min!=null && root.data <= min.data) {
            return false;
        }
        else if(max != null && root.data >= max.data ) {
            return false;
        }
        return isvalidBST(root.left, max, max) && isvalidBST(root.right, max, max);
    }
    public static void main(String args[]) {
        int values[]={8,5,3,6,10,11,14};
        
    }
}
