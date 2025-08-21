// conatins
 class BST {

    Node root;

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
    }
}

    public boolean Contains(int value){

        if(root == null) return false;
        Node temp = root;
        while(temp != null){
            if(value < temp.value){
                temp = temp.left;
            }else if(value > temp.value){
                temp = temp.right;
            }
            else{// equal
                return true;
            }
        }
        return false;
    }
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
}
// Conatins
public class BinarySearchTree1 {
    public static void main(String[] args){
        BST bst = new BST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(18);
        bst.insert(27);
        bst.insert(76);
        bst.insert(52);
        bst.insert(82);
        
        System.out.println(bst.Contains(52));
    }
}
