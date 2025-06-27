package Queue;
import java.util.*;
public class ReverseFirstKElements {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q); //1 2 3 4 5 6
        int k=3;  // 3 2 1 4 5 6
        Stack<Integer> st= new Stack<>();
        for(int i=0; i<k; i++){
            st.push(q.remove());
        }
        //4 5 6
        while(st.size()>0){
            q.add(st.pop());
        }
        //4 5 6 3 2 1
        for(int i=0; i<q.size()-k; i++){
            int x=q.remove();
            q.add(x);
        }
        System.out.println(q);
    }
}
