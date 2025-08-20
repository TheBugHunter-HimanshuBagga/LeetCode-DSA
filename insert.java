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
    // get
        public Node get(int index){          
        if(index < 0 || index > length) return null;
        Node temp = head; // 1-2-3-4-5       // 0-1-2-3-4
        if(index < length/2)// since its DLL // 1-2-3-4-5-4-3-2-1
        for(int i = 0 ; i < index ; i++){   
            temp = temp.next;
        }
        else{
            temp = tail; // 5-4-3-2-1
            for(int i = length - 1 ; i > index ; i--){ //
                temp = temp.prev; // 5-4-3-2-1
            }
        }
        return temp;
    }

    // Insert a new node  11-3-23-7 -> 11-3-4-23-7
    public boolean insert(int index , int value){
        if(index < 0 || index > length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        before.next = newNode;
        newNode.next = after;
        after.prev = newNode;
        length++;
        return true;
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
            System.out.print(""+temp.value);
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
public class insert {
    public static void main(String[] args){    
        DoublyLinkedList DLL = new DoublyLinkedList(5);
        DLL.append(6);
        DLL.insert(2,4);
        DLL.printList();
    }
}
