package Scratch.BinaryTree;
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}
public class BinaryTree {
    Node root;

    public void insert(int data){
        root = recInsert(root, data);
    }
    private Node recInsert(Node root, int data)
    {
        if(root == null){
            root = new Node(data);
        }
        else if(data < root.data){
            root.left = recInsert(root.left, data);
        }
        else if(data > root.data){
            root.right = recInsert(root.right, data);
        }
        return root;
    }
    public void inOrder(){
        recInOrder(root);
    }
    private void recInOrder(Node root){
        if (root != null) {
          recInOrder(root.left);  
          System.out.print(root.data + " ");
          recInOrder(root.right);
        }
    }
    public void preOrder(){
        recPreOrder(root);
    }
    private void recPreOrder(Node root){
        if (root != null) {
            System.out.print(root.data + " ");
            recInOrder(root.left);  
            recInOrder(root.right);
          }
    }
}
