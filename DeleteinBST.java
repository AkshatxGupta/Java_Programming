public class DeleteinBST {
    public static class Node{
        int data;
        Node left,right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node delete(Node root , int val) {
        if(root.data<val) {
            root.right = delete(root.right, val);
        }
        else if(root.data>val) {
            root.left = delete(root.left, val);
        }
        else{
            //case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 - single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case 3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root) {
        while(root.left!=null) {
            root = root.left;
        }
        return root;
    }
}
