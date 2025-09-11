// stackusingArrays

public class stackusingArrays {
    private int[] stack;
    private int top;
    private int capacity;

    public stackusingArrays(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int value){
        if(top == capacity - 1){
            System.out.println("System overflow");
            return;
        }else{
            stack[++top] = value;
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }return stack[top--];
    }
    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }return stack[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public int size(){
        return top + 1 ;
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }else{
            System.out.println("Stack Elements");
            for(int i = 0 ; i <= top ; i++){
                System.out.println(stack[i] + " ");
            }
        }

    }
    public static void main(String[] args){

        stackusingArrays s = new stackusingArrays(8);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Top element: " + s.peek());
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
