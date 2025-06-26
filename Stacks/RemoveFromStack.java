package Stacks;
import java.util.*;
public class RemoveFromStack {
    public static void main(String[] args) {
        Stack <Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack <Integer> rt= new Stack<>();
        //we are removing 1
        int idx= 1;  // index of element=2
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.pop();   //1 is removed
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
    
}
