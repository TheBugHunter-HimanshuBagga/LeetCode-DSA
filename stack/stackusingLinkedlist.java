
public class stackusingLinkedlist {
    public Node top;
    public int size;

    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public stackusingLinkedlist(){
        top = null;
        size = 0;
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        size++;
    }
    public int pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.value;
        top = top.next;
        size--;
        return popped;
    }
    public int peek(){
        if(top == null){
            System.out.println("Stack Underflow");
            return -1;
        }return top.value;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int size(){
        return size;
    }
    public void display(){
        if(top == null){
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        stackusingLinkedlist s = new stackusingLinkedlist();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Top element: " + s.peek());
        System.out.println("Popped: " + s.pop());
        s.display();
    }    
}
