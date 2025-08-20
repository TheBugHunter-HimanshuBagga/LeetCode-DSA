// First in first out (FIFO) data structure
class QueueConstructors {

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

    public QueueConstructors(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
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
            System.out.println("First: null");
    }

    public void getLast() {
        if (last != null)
            System.out.println("Last: " + last.value);
        else
            System.out.println("Last: null");
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}

public class constructors {
    public static void main(String[] args) {
        QueueConstructors qC = new QueueConstructors(6);
        qC.getFirst();
        qC.getLast();
        qC.getLength();
        qC.printQueue();
    }
}            