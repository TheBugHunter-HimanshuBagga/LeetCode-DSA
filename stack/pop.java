class popstack{
    
    private Node top;
    private int height;

class Node{
    int value;
    Node next;
        Node(int value){
            this.value = value;
        }
    }
    public popstack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    public Node popstack(){
        if(height == 0) return null;

            Node temp = top;
            top = top.next;
            temp.next = null;

            height--;
            return temp;
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public void printstack(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;   
        }
    }
}
public class pop {
    public static void main(String[] args){
        popstack popkar = new popstack(1);
        popkar.push(2);
        popkar.push(3);
        System.out.println("Before popping:");
        popkar.printstack();
        popkar.popstack();
        System.out.println("\nAfter popping:"); 
        popkar.printstack();
    }
}
