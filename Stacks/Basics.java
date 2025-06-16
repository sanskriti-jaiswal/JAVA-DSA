package Stacks;
import java.util.*;
//OR java.util.Stack;
public class Basics {
    public static void main(String[] args) {
        // ArrayList <Integer> al= new ArrayList<>();
        Stack <Integer> st= new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(32);
        st.push(5);

        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.size());

        while(st.size()>1){
            st.pop();
        }
        System.out.println("topmost element"+st.peek());
        System.out.println(st);
    }
}
