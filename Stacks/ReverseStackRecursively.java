package Stacks;
import java.util.*;
public class ReverseStackRecursively {

    public static void reverse(Stack<Integer> st){
        if(st.size()==1){ //already reversed  
            return;
        }
        int top= st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }

    public static void pushAtBottom(Stack<Integer> s, int x){
        if(s.size()==0){
            s.push(x);
            return;
        }
        int top= s.pop();
        pushAtBottom(s, x);
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
        reverse(st);
        System.out.println(st);
    }
}
