// Enqueue is adding something to the end of a queue
class EnQueueList {

    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Default constructor
    public EnQueueList() {
        first = null;
        last = null;
        length = 0;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void printQueue() {
        Node temp = first;
        if (length == 0) {
            System.out.println("Queue is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getFirst() {
        if (first != null)
            System.out.println("First: " + first.value);
        else
            System.out.println("Queue is empty");
    }

    public void getLast() {
        if (last != null)
            System.out.println("Last: " + last.value);
        else
            System.out.println("Queue is empty");
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}

public class enqueue {
    public static void main(String[] args) {
        EnQueueList enQ = new EnQueueList();
        enQ.enqueue(10);
        enQ.enqueue(20);
        enQ.enqueue(30);

        enQ.getFirst();    // Should print 10
        enQ.getLast();     // Should print 30
        enQ.getLength();   // Should print 3
        enQ.printQueue();  // Should print 10 20 30
    }
}
