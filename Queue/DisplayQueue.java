package Queue;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class DisplayQueue {
    public static void main(String[] args) {
        //when we push elements to another queue it goes in the same order (unlike stack)
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // System.out.println(q);
        Queue<Integer> helper= new ArrayDeque<>();
        while(q.size()>0){
            System.out.print(q.peek()+ " ");
            helper.add(q.poll());
        }
        while(helper.size()>0){
            q.add(helper.poll());
        }


    }
}
