public class binarySearchTree {

    class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    Node root;
    public void insert(int data)
    {
        root = inserRec(root , data);
    }
    public Node inserRec(Node root ,int data){
        if(root == null) {
           root = new Node(data);
         }else if(data < root.data) {
             root.left = inserRec(root.left , data);
        }else if(data > root.data) {
            root.right = inserRec(root.right , data);
        }
        return root;
    }
    public void inOrder(){
        inOrderTraverse(root);
    }
    public void preOrder(){
        preOrderTraverse(root);
    }
    public void postOrder(){
        postOrderTraverse(root);
    }

    public void inOrderTraverse(Node root) {
        if(root != null) {
            inOrderTraverse(root.left);
            System.out.print(root.data + " ");
            inOrderTraverse(root.right);

        }
    }
    public void preOrderTraverse(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            inOrderTraverse(root.left);
            inOrderTraverse(root.right);

        }
    }
    public void postOrderTraverse(Node root) {
        if(root != null) {
            inOrderTraverse(root.left);
            inOrderTraverse(root.right);
            System.out.print(root.data + " ");
        }
    }
}
