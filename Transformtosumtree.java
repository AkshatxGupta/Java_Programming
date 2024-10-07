public class Transformtosumtree {
    public static int transform(Node root ) {
        if(root==null) {
            return 0;
        }
        int leftchild = transform(root.left);
        int rightchild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftchild + newRight + rightchild;
        return data;
    }
    public static void preorder(Node root){
        if(root == null ){
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        
    }
}
