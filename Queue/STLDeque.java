package Queue;
import java.util.*;
public class STLDeque {
    public static void main(String[] args) {
        Deque<Integer> dq= new LinkedList<>();
        
        // dq.addLast(1);
        // dq.addLast(2);
        // dq.addLast(3);
        // dq.addLast(4);
        // dq.addFirst(5);
        // System.out.println(dq);
        // dq.removeLast();
        // System.out.println(dq);
        // dq.removeFirst();
        // System.out.println(dq);
        // System.out.println(dq.getFirst());
        // System.out.println(dq.getLast());

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(4);
        dq.add(5); //by default adds at last
        System.out.println(dq);
        dq.remove(); //removes at first by default
        System.out.println(dq);
        dq.removeAll(dq);  //empty the deque
        System.out.println(dq);


    }
}
