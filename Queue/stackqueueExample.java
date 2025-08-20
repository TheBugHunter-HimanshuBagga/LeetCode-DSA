import java.util.*;

public class stackqueueExample {
    public static void main(String[] args){
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println("Stack after pushing elements: " + stack);

        Deque<Integer> queue = new LinkedList<>(); // ArrayDeque
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("queue after adding elements: " + queue);
    }
}