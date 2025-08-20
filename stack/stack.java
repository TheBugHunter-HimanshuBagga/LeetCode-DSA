class stackList{

    private Node top;
    // no bottom for stack
    private int height;

    class Node{
        int value;
        Node next;
        // constructor for Node
        Node(int value){
            this.value = value;
        }
    }
    public stackList(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode; // newNode becomes the new top
        }
        height++;
    }

    public void printstack(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.value + " \n");
            temp = temp.next;
        }
    }
    public void getTop(){
        System.out.println("Top element: " + top.value);
    }
    public void getHeight(){
        System.out.println("Height : " + height);
    }   
}
public class stack{
    public static void main(String[] args){
        stackList sL = new stackList(1);
        sL.append(2);
        sL.append(3);   
        sL.printstack();
        sL.getTop();
        sL.getHeight();
    }
}
