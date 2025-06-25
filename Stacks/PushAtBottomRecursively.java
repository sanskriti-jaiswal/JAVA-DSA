package Stacks;
import java.util.*;
public class PushAtBottomRecursively {
    public static void pushatbottom(Stack<Integer> s, int x){
        if(s.size()==0){
            s.push(x);
            return;
        }
        int top= s.pop();
        pushatbottom(s, x);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack <Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        pushatbottom(st, 0);
        System.out.println(st);
    }
}
