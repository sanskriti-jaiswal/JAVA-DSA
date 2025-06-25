package Queue;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
public class BasicSTLImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        Stack<Integer> st= new Stack<>();  //stack is an interface

        //this is wrong way to create queue
        //Queue<Integer> q= new Queue<>();   //queue is abstract cannot be instantiated not an interface

        // Queue<Integer> q= new ArrayDeque<>();
        Queue<Integer> q= new LinkedList<>();

        //add peek/element remove/poll isEmpty size
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        System.out.println(q); //1 2 3 4 5
        q.remove();
        System.out.println(q); //2 3 4 5
        q.poll();  //also for removing
        System.out.println(q); //3 4 5
        System.out.println(q.element());
        System.out.println(q.peek());


    }
}
