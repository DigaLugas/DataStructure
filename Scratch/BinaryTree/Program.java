package Scratch.BinaryTree;

public class Program {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(9);
        tree.insert(10);
        tree.insert(51);
        tree.insert(32);
        tree.insert(4);
        tree.insert(7);
        tree.preOrder();
        System.out.println(" ");
        tree.inOrder();
    }
}
