// Binary trees - Generic trees -> (parents , children)
// Binary tree -> have only 2 children at max
// leaf node -> node with no children
// internal node -> node with at least one child
// height of tree -> number of edges in longest path from root to leaf node
// Subtree -> any node along with its descendants

// Build a binary tree
package trees;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Main {

    static int index = -1;

    // Function to build tree from preorder array
    public static Node buildTree(int[] preorder) {
        index++;
        if (index >= preorder.length || preorder[index] == -1) {
            return null;
        }

        Node newNode = new Node(preorder[index]);
        newNode.left = buildTree(preorder);
        newNode.right = buildTree(preorder);

        return newNode;
    }

    // Preorder traversal
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int[] preorder = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};

        Node root = buildTree(preorder);

        preOrder(root);
        System.out.println();
    }
}
