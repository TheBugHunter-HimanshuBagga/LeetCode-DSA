class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else { //  1 - 2 - 3 - 4  $assuming newNode is 5
            tail.next = newNode; // tail =  4.next = 5 , 1-2-3-4-5
            newNode.prev = tail; // 5.prev = 4(tail before appending)
            tail = newNode; // tail = 5(newTail)
        }length++;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length: " + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
}
public class append {
    public static void main(String[] args){
        DoublyLinkedList DLL = new DoublyLinkedList(1);
        DLL.append(2);  
        DLL.append(3);
        DLL.append(4);

        DLL.printAll();
    } 
}
