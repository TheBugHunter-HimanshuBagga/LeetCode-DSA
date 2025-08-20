class DeQueueList {

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

    public DeQueueList() {
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

    public void dequeue() {
        if (length == 0) {
            System.out.println("Queue is empty, can't dequeue.");
            return;
        }
        Node temp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
    }

    public void printQueue() {
        if (length == 0) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class dequeue {
    public static void main(String[] args) {
        DeQueueList deQ = new DeQueueList();
        deQ.enqueue(10);
        deQ.enqueue(20);
        deQ.enqueue(30);
        
        System.out.println("Queue before dequeue:");
        deQ.printQueue(); // Should print 10 20 30
        
        deQ.dequeue(); // Should remove 10
        System.out.println("Queue after dequeue:");
        deQ.printQueue(); // Should print 20 30
        
        deQ.dequeue(); // Should remove 20
        System.out.println("Queue after another dequeue:");
        deQ.printQueue(); // Should print 30
        
        deQ.dequeue(); // Should remove 30
        System.out.println("Queue after all dequeues:");
        deQ.printQueue(); // Should print nothing, queue is empty
    }
}