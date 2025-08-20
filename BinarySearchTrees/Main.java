public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        System.out.print("Inorder traversal: ");
        bst.printInorder();  // should print 3 5 7
    }
}
