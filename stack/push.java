class pushstack{

    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
    public pushstack(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;

        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    public void printlist(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
    }
}
public class push {
    public static void main(String[] args){
        pushstack pushkar = new pushstack(1);
        pushkar.append(2);
        pushkar.append(3);
        pushkar.printlist();
    }
}
