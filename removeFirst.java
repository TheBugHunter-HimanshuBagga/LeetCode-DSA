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
    // public void removeLast(){ // 1-2-3-4-5 to remove 5
    //     if(length == 0){ // 0 node then use this
    //         head = null;
    //         tail = null;
    //     }
    //     else if(length == 1){ // 1 - head and tail are same 
    //         head = null;  
    //         tail = null;
    //     }
    //     else{
    //         tail = tail.prev; // tail = 4 (before it was 5)
    //         tail.next = null; // 4.next = null
    //     }length--;
    // }
    	public Node removeLast(){
	     if(length == 0) return null;
	    Node temp = tail; //temp is the refrence of the removed node
	    if(length == 1){
	        head = null;
	        tail = null;
	    }
	    else{
	        tail = tail.prev;
	        tail.next = null;
	        temp.prev = null;
	    }length--; return temp;
	}

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode; // For doubbly linked list
            head = newNode;
        }length++;
    }

    	public Node removeFirst(){
	    if(length == 0) return null;
	    Node temp = head;
	    if(length == 1){ // 1 - remove 1 null = head and tail
	        head = null;
	        tail = null;
	    }else{         // 1 -2 - 3 -4 -5 > head =1(.next)=newhead > head.prev = 0 
	        head.next = head;
	        head.prev = null;
	        temp.next = null;
	    }length--; return temp;
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
            System.out.print(" "+temp.value);
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
public class removeFirst {
    public static void main(String[] args){    
        DoublyLinkedList DLL = new DoublyLinkedList(5);
        DLL.append(6);
        DLL.removeFirst();
        DLL.printAll();
    }
}

